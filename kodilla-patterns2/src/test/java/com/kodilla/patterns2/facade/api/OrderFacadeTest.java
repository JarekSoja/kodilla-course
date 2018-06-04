package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class OrderFacadeTest {

    @Autowired
    OrderFacade orderFacade;

    @Test
    public void processOrder() throws OrderProcessingException {

        List<ItemDto> test = new ArrayList<>();
        orderFacade.processOrder(new OrderDto(), 1L);
    }
}