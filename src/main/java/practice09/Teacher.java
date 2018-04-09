package practice09;

public class Teacher {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
        }else{
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+klass.getDisplayName()+".";
        }
    }

    public String introduceWith(Student student) {
        if (klass.getNumber() == student.getKlass().getNumber()){
            return "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+student.getName()+".";
        }else {
            return "My name is "+name+". I am "+age+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }

    }
}
