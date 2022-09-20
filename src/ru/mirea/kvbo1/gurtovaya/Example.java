package ru.mirea.kvbo1.gurtovaya;

public class Example {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Васильев А.А.", 1, "", "24.12.2003", "+89177461415");
        Reader reader2 = new Reader("Пресняков Б.А.", 2, "", "29.05.1978", "+89179882380");
        Reader reader3 = new Reader("Дурачков Е.Е.", 3, "", "05.01.2009", "+89785461325");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Война и мир", "Л.Н.Толстой");
        Book book2 = new Book("451 градус по Фаренгейту", "Рэй Брэдберри");
        Book book3 = new Book("3 просенка", "С.В.Михалков");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Операция для мозга, Лаврова", "Эмма, Джейн Остен");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(1);
        reader2.returnBook("Гордость и предубеждение, Джейн Остен");
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}

