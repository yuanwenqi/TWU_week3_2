package practice08;

public class Student {

    private int age;
    private Klass k;
    private String name;
    private int id;

    public Student(int myid, String myname, int myage, Klass myk) {
        name = myname;
        id = myid;
        age = myage;
        k = myk;
    }
    public boolean isEqualTo(Student student){
        return  student.name == name;
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
        if (k.getLeader() == null){
            return  "My name is "+name+". I am "+age+" years old. I am a Student. I am at "+k.getDisplayName()+".";
        }else {
            return  "My name is "+name+". I am "+age+" years old. I am a Student. I am Leader of "+k.getDisplayName()+".";
        }
    }
}
