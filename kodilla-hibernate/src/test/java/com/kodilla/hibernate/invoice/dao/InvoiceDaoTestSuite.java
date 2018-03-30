package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given

        Product product = new Product("Apples");
        Product product1 = new Product("Oranges");
        Item item = new Item(product, new BigDecimal("11.1"), 5, new BigDecimal("55.5"));
        Item item2 = new Item(product, new BigDecimal("10"), 4, new BigDecimal("40"));
        List<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        Item item3 = new Item(product1, new BigDecimal("22.2"), 1, new BigDecimal("22.2"));
        Item item4 = new Item(product1, new BigDecimal("100"), 2, new BigDecimal("200"));
        List<Item> items2 = new ArrayList<>();
        items2.add(item3);
        items2.add(item4);
        Invoice invoice = new Invoice("1.As", items);
        Invoice invoice2 = new Invoice("2.As", items2);

        invoiceDao.save(invoice);
        invoiceDao.save(invoice2);

        //When
        int numberOfItems = invoice.getItems().size();
        int numberOfItems2 = invoice2.getItems().size();
        int firstInvoiceId = invoice.getId();
        int secondInvoiceId = invoice2.getId();
        String firstInvoiceProductName = invoice.getItems().get(0).getProduct().getName();
        String secondInvoiceProductName = invoice2.getItems().get(0).getProduct().getName();

        //Then
        Assert.assertEquals(2, numberOfItems);
        Assert.assertEquals(2, numberOfItems2);
        Assert.assertEquals("Apples", firstInvoiceProductName);
        Assert.assertEquals("Oranges", secondInvoiceProductName);

        //CleanUp
        invoiceDao.delete(firstInvoiceId);
        invoiceDao.delete(secondInvoiceId);
    }
}
