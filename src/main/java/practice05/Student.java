package practice05;

public class Student {
    private String name;
    private int age;
    private int i1;
    public Student(String myname, int myage, int myi1) {
        name = myname;
        age = myage;
        i1 = myi1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKlass() {
        return i1;
    }

    public String introduce() {
        return "My name is "+name+". I am "+age+" years old. I am a Student. I am at Class "+i1+".";
    }
}
