package task_16.Comparators;

import task_12.Book;

import java.util.Comparator;

public class SortByNameThenAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        var titleCompare = o1.getTitle().compareTo(o2.getTitle());
        return titleCompare != 0 ? titleCompare : o1.getAuthor().compareTo(o2.getAuthor());
    }
}
