package vanny.test.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotfoundException extends ApiException {
	public ResourceNotfoundException(String resourceName,Long id) {
		super(HttpStatus.NOT_FOUND, String.format("%s with id = %d nto found",resourceName,id));
	}
}
