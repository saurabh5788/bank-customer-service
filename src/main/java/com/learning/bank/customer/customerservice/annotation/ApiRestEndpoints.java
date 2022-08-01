package com.learning.bank.customer.customerservice.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * A convenient annotation that is itself annotated with commonly used Annotations
 * as follows : 
 * {@link RestController @RestController}
 * {@link Validated @Validated}
 * {@link RequestMapping @RequestMapping}
 * @
 * @author Saurabh Singh
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Validated
@RestController
@RequestMapping(produces = {
		MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public @interface ApiRestEndpoints {
	/**
	 * The primary mapping expressed by this annotation.
	 * @return
	 */
	@AliasFor(annotation = RequestMapping.class)
	String value() default "";

}
