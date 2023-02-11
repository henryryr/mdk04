package dz2.main.java;

public class Magazine implements Printable //3
{
    private String name;

    public Magazine(String name) {
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
        System.out.println("Magazine print - " + getName());
    }


}
