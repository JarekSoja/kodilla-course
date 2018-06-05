package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    private Statistics statistics;

    public MedianAdaptee(Statistics statistics) {
        this.statistics = statistics;
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return 0;
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {

    }
}
