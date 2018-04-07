package practice06;

public class Teacher {
    private String name;
    private int age;
    private int id = -1 ;
    public Teacher(String myname,int... my){
        name = myname;
        age = my[0];
        if (my.length>1){
            id =  my[1];
        }
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public int getKlass() {
        return id;
    }

    public String introduce() {
        if (id == -1){
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
        }else {
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach Class "+id+".";
        }
    }

}
