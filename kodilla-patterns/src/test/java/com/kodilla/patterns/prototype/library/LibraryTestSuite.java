package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Book bookMiecz = new Book("Wiedźmin: Miecz Przeznaczenia", "Andrzej Sapkowski",
                LocalDate.of(1993, 01, 26));
        Book bookKrew = new Book("Wiedźmin: Krew Elfów", "Andrzej Sapkowski",
                LocalDate.of(1994, 04, 17));
        Book bookCzas = new Book("Wiedźmin: Czas Pogardy", "Andrzej Sapkowski",
                LocalDate.of(1995, 9, 13));

        Library library = new Library("Biblioteka Uniwersytetu Magii i Czaroksięstwa");
        library.getBooks().add(bookMiecz);
        library.getBooks().add(bookKrew);
        library.getBooks().add(bookCzas);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(bookKrew);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}