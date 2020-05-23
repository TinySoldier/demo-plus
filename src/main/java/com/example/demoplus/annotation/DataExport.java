package com.example.demoplus.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标识目标方法是导出方法，可以用来处理异常等等
 * @author ：haowenju
 * @date ：2020-05-21 12:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataExport {
}
