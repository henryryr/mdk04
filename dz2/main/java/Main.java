package dz2.main.java;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("kniga1");
        Book b2 = new Book("kniga2");
        Magazine m1 = new Magazine("zhurnal1");
        Magazine m2 = new Magazine("zhurnal2");

        Printable[] printables = {b1, b2, m1, m2};

        for (Printable printable : printables)
        {
            printable.Print();
        }
    }

}
