package com.effective.common.aop;

import com.effective.common.ResultBean;
import com.effective.common.exception.TestException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * @Description 处理和包装异常
 * @author:caiyuan
 * @date:2020/1/15 0015
 * @ver:1.0
 **/
@Slf4j
public class ControllerAop {

    public Object handlerControllerMethod(ProceedingJoinPoint point) {
        long startTime = System.currentTimeMillis();
        ResultBean<?> resultBean;
        try {
            resultBean = (ResultBean<?>) point.proceed();
            log.info(point.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
        } catch (Throwable e) {
            resultBean = handlerException(point, e);
        }
        return resultBean;
    }

    /**
     * 封装异常信息，注意区分已知异常（自己抛出的）和未知异常
     * 
     * @param point
     * @param e 
     * @return com.effective.common.ResultBean<?>
     * @methodName handlerException
     * @author caiyuan
     * @date 2020/1/15 0015 
     */
    private ResultBean<?> handlerException(ProceedingJoinPoint point,Throwable e) {
        ResultBean<?> resultBean = new ResultBean<>();

        //已知异常
        if (e instanceof TestException) {
            resultBean.setMsg("TestException中的异常信息");
            resultBean.setCode(ResultBean.FAIL);
        } else {
            log.error(point.getSignature() + "error:", e);
            // TODO: 2020/1/15 0015 未知异常，应该格外注意，可以发送邮件通知等。
            resultBean.setMsg(e.toString());
            resultBean.setCode(ResultBean.FAIL);
        }
        return resultBean;
    }
}
