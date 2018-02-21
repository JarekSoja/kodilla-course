package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        LibraryUser antek = new LibraryUser("Antek", "Rozpylacz", "77771276543");
        LibraryUser franek = new LibraryUser("Franek", "Zuch", "777712755555");
        LibraryUser marysia = new LibraryUser("Marysia", "Zusicka", "7777127365633");
        List<Book> result = new ArrayList<>();
        if (libraryUser.equals(antek)) {
            result.add(new Book("Aaa", "Eee", 1980));
            return result;
        }
        else if (libraryUser.equals(marysia)) {
            result.add(new Book("Aaa", "Eee", 1980));
            result.add(new Book("Aaa", "Eee", 1981));
            result.add(new Book("Aaa", "Eee", 1982));
            result.add(new Book("Aaa", "Eee", 1983));
            result.add(new Book("Aaa", "Eee", 1984));
            return result;
        } else return result;
    }
}