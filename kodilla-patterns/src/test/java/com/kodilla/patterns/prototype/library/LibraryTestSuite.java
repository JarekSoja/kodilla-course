package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Test library");
        IntStream.iterate(1, n-> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("New book: " + String.valueOf(n), "New Author: "+ String.valueOf(n), LocalDate.now() )));

        for (Book book : library.books){
            System.out.println(book + " is placed in " + library.getName());
        }

        Library clonedLibrary = null;

        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        for (Book book : clonedLibrary.books){
            System.out.println(book + " is placed in " + clonedLibrary.getName());
        }

        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        for (Book book : deepClonedLibrary.books){
            System.out.println(book + " is placed in " + deepClonedLibrary.getName());
        }

        //When
        library.books.clear();

        //Then
        Assert.assertEquals(0, library.books.size());
        Assert.assertEquals(0, clonedLibrary.books.size());
        Assert.assertEquals(5, deepClonedLibrary.books.size());
    }

}
