package practice04;

public class Worker {
    private String name;
    private int age;
    public Worker(String myname,int myage){
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
        return  "My name is "+name+". I am "+age+" years old. I am a Worker. I have a job.";
    }
}
