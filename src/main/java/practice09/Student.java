package practice09;

public class Student {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass.getLeader() != null){
            return "My name is "+name+". I am "+age+" years old. I am a Student. I am Leader of "+klass.getDisplayName()+".";
        }else {
            return "My name is "+name+". I am "+age+" years old. I am a Student. I am at "+klass.getDisplayName()+".";
        }
    }
}
