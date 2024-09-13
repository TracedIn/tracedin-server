package com.univ.tracedin.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface CursorDefault {

    int page() default 0;

    int size() default 10;

    String sortFields() default "createdAt";

    String sortDirections() default "DESC";
}
