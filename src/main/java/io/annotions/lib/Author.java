package io.annotions.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  Created by shailendra.singh on 4/11/17.
 *
 *  usage - @Author(value="shailendra.singh")
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {

    String value () default "";
}
