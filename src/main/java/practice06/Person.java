package practice06;

public class Person {
    private String name;
    private int age;
    public Person(String myname, int myage) {
        name = myname;
        age = myage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return  "My name is "+name+". I am "+age+" years old.";
    }
}
