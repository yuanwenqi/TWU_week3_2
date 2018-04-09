package practice08;

public class Person {
    private  String name;
    private  int age;
    private  int id;

    public Person(int myid, String myname, int myage) {
        name = myname;
        age = myage;
        id = myid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEqualTo(Person person){
        return person.name == this.name;
    }

    public String introduce() {
        return  "My name is "+name+". I am "+age+" years old.";
    }

    public boolean equals(Object object){
        if (object instanceof Person){
            Person p = (Person)object;
            if (this.id == p.id){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
