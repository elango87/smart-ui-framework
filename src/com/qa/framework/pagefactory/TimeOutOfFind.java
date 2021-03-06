package com.qa.framework.pagefactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Sets the default implementing class for the annotated interface.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeOutOfFind {
    /**
     * Value int.
     *
     * @return the int
     */
    int value() default 10000;
}
