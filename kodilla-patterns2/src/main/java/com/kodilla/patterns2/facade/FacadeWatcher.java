package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {

    public static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before ("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order,  Long userId, Object object) {
        LOGGER.info("Testing processOrder(), orderDto: " + order.toString() + ", user Id: " + userId + " target: " + object.getClass().getCanonicalName());
    }
}