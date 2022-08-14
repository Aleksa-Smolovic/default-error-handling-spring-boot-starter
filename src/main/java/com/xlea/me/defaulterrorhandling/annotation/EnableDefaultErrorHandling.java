package com.xlea.me.defaulterrorhandling.annotation;


import com.xlea.me.defaulterrorhandling.error.ExceptionTranslator;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(ExceptionTranslator.class)
public @interface EnableDefaultErrorHandling {
}
