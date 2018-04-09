package practice07;

public class Student {
    private  String name;
    private  int age;
    private  Klass k;
    public Student(String myname, int myage, Klass  myk) {
        name = myname;
        age = myage;
        k = myk;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return k;
    }

    public String introduce() {
        return "My name is Tom. I am 21 years old. I am a Student. I am at "+k.getDisplayName()+".";
    }
}
