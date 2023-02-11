package dz2.main.java;

public class Book implements Printable { //2


    private String name;

    public Book(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Print()
    {
        System.out.println("Book print - " + getName());
    }


}
