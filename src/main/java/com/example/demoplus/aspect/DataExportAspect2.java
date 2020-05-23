package com.example.demoplus.aspect;

import com.example.demoplus.annotation.DataExport;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：haowenju
 * @date ：2020-05-21 14:15
 */
@Aspect
@Order(2)
@Component
public class DataExportAspect2 {

    @Around(value = "@annotation(dataExport)")
    public Object after(ProceedingJoinPoint point, DataExport dataExport) throws Throwable {
        System.out.println("begin 2");
        Object result = point.proceed();
        System.out.println(result);
        System.out.println("end 2");
        return result;
    }
}
