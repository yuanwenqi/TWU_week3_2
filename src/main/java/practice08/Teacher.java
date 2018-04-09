package practice08;

public class Teacher {
    private int age;
    private String name;
    private int id;
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        this.age = age;
        this.name = name;
        this.id = id;
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
        if (klass == null){
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
        }
        return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+klass.getDisplayName()+".";
    }

    public String introduceWith(Student student) {
        if (klass.getNumber() == student.getKlass().getNumber()){
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+student.getName()+".";
        }else {
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
