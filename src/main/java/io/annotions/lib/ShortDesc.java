package io.annotions.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  Created by shailendra.singh on 4/11/17.
 *
 *  usage - @ShortDesc short desc of the method
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ShortDesc {

    String value () default "";
}
