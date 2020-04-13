package fr.u.picardie.m2.d605.security.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundBeanException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundBeanException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundBeanException(String message) {
		super(message);
	}

}
