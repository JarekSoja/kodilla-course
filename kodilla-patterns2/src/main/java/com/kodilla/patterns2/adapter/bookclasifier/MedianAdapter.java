package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public MedianAdapter(Statistics statistics) {
        super(statistics);
    }

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        return 0;
    }
}
