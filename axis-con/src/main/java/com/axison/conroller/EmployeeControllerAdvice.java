//package com.axison.conroller;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.FieldError;
//import org.springframework.web.ErrorResponse;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import com.axison.model.SimpleErrorResponse;
//
//@ControllerAdvice
//public class EmployeeControllerAdvice {
//	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<SimpleErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
//        List<String> errors = ex.getBindingResult()
//                                .getFieldErrors()
//                                .stream()
//                                .map(FieldError::getDefaultMessage)
//                                .collect(Collectors.toList());
//        SimpleErrorResponse errorResponse = new SimpleErrorResponse("Validation Failed", errors);
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//    }
//
//}
