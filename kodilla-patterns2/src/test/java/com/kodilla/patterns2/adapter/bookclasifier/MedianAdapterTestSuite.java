package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void testMedianYear() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("111", "222", 1992, "1");
        Book book2 = new Book("111", "222", 1966, "1");
        Book book3 = new Book("111", "222", 1943, "1");
        Book book4 = new Book("111", "222", 2005, "1");
        Book book5 = new Book("111", "222", 2011, "1");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        //When
        int median = adapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(1992, median,0);
    }

}