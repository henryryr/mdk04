public class Person {
    public static void main(String[] args)
    {
        Person name = new Person();

        Person fullname = new Person(name.fullName, name.age);

        fullname.move();

        name.talk();

    }
    public String fullName = "Pasha";
    public int age = 18;

    public void talk()
    {
        System.out.println(fullName + " говорит ");
    }

    public void move()
    {
        System.out.println(fullName + " идет ");
    }

    public Person()
    {

    }

    public Person(String fullname, int age)
    {
        this.fullName = fullname;
        this.age = age;
    }

}
