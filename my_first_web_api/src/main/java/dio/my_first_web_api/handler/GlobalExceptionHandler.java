package dio.my_first_web_api.handler;

import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.annotation.Resource;

// Anotação para definir um controlador de exceções global
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // Injeção de dependência para capturar mensagens de origem das exceções
    @Resource
    private MessageSource messageSource;

    // Método para configurar os cabeçalhos HTTP das respostas
    private HttpHeaders headers() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON); // Define o tipo de conteúdo como JSON
        return headers;
    }

    // Método para construir um objeto de resposta de erro
    private ResponseError responseError(String message, HttpStatus statusCode) {
        ResponseError responseError = new ResponseError();
        responseError.setStatus("error");
        responseError.setError(message);
        responseError.setStatusCode(statusCode.value());
        return responseError;
    }

    // Manipulador de exceções genéricas
    @ExceptionHandler(Exception.class)
    private ResponseEntity<Object> handleGeneral(Exception e, WebRequest request) {
        // Verifica se a exceção é do tipo UndeclaredThrowableException
        if (e.getClass().isAssignableFrom(UndeclaredThrowableException.class)) {
            // Lança a exceção de negócios associada
            UndeclaredThrowableException exception = (UndeclaredThrowableException) e;
            return handleBusinessException((BusinessException) exception.getUndeclaredThrowable(), request);
        } else {
            // Obtém a mensagem de erro a partir do MessageSource
            String message = messageSource.getMessage("error.server", new Object[]{e.getMessage()}, null);
            ResponseError error = responseError(message, HttpStatus.INTERNAL_SERVER_ERROR);
            // Retorna a resposta com a mensagem de erro e o status HTTP 500
            return handleExceptionInternal(e, error, headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        }
    }

    // Manipulador de exceções específicas de negócios
    @ExceptionHandler({BusinessException.class})
    private ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) {
        // Constrói a resposta de erro para exceções de negócios
        ResponseError error = responseError(e.getMessage(), HttpStatus.CONFLICT);
        // Retorna a resposta com a mensagem de erro e o status HTTP 409
        return handleExceptionInternal(e, error, headers(), HttpStatus.CONFLICT, request);
    }
}
