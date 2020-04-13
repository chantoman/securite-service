package fr.u.picardie.m2.d605.security.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ExceptionReponse exceptionReponse = new ExceptionReponse(new Date(), "Validation failed",
				ex.getBindingResult().getAllErrors());
		return new ResponseEntity<>(exceptionReponse, HttpStatus.BAD_REQUEST);
	}

//	@ExceptionHandler(Exception.class)
//	protected ResponseEntity<Object> handleDefaultException(Exception ex) {
//		ExceptionReponse exceptionReponse = new ExceptionReponse(new Date(), ex.getMessage(), ex.getLocalizedMessage());
//		return new ResponseEntity<>(exceptionReponse, HttpStatus.SERVICE_UNAVAILABLE);
//	}

	@ExceptionHandler(NotFoundBeanException.class)
	protected ResponseEntity<Object> handleNotFoundException(NotFoundBeanException ex) {
		ExceptionReponse exceptionReponse = new ExceptionReponse(new Date(), ex.getMessage(), ex.getLocalizedMessage());
		return new ResponseEntity<>(exceptionReponse, HttpStatus.NOT_FOUND);
	}
}
