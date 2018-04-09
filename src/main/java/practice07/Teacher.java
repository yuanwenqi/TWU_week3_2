package practice07;

public class Teacher {
    private String name;
    private int age;
    private  Klass k;
    public Teacher(String myname, int myage, Klass myk) {
        name = myname;
        age = myage;
        k = myk;
    }

    public Teacher(String myname, int myage) {
        name = myname;
        age = myage;
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
        if (k != null){
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+k.getDisplayName()+".";
        }else{
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
        }

    }

    public String introduceWith(Student student) {
        if (k.id == student.getKlass().id){
            return "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+student.getName()+".";
        }else{
            return "My name is "+name+". I am "+age+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
