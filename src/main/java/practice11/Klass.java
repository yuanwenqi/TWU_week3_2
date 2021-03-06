package practice11;

public class Klass extends Object {
    private int id;
    private Student leader;
    private Student member;

    public Klass(int id) {
        this.id = id;
    }

    public int getNumber() {
        return id;
    }

    public String getDisplayName() {
        return "Class "+id;
    }

    public void assignLeader(Student student) {
        if (member != student){
            System.out.print("It is not one of us.\n");
        }else{
            leader = student;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        member = student;
        System.out.print("I am Tom. I know Jerry has joined "+getDisplayName()+".\n");
    }


}