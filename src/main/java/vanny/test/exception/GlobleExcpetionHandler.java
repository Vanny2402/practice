package vanny.test.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExcpetionHandler {
	
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<?>handleApiException(ApiException e){
		ErrorResponse err=new ErrorResponse(e.getStatus(),e.getMessage());
		return ResponseEntity.status(e.getStatus()).body(err);
	}
	
}
