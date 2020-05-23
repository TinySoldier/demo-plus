package com.example.demoplus.aspect;

import com.example.demoplus.annotation.DataExport;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ：haowenju
 * @date ：2020-05-21 14:15
 */
@Aspect
@Order(1)
@Component
public class DataExportAspect {

    @Around(value = "@annotation(dataExport)")
    public Object after(ProceedingJoinPoint point, DataExport dataExport) throws Throwable {
        System.out.println("begin 1");
        Object result = point.proceed();
        System.out.println(result);
        System.out.println("end 1");

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        System.out.println(response);

        response.getWriter().write("hahahah");
        return null;
    }
}
