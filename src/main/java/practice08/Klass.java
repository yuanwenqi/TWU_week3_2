package practice08;

public class Klass {
    private int id;
    private Student leader;
    public Klass(int i) {
        id = i;
    }

    public int getNumber() {
        return id;
    }

    public String getDisplayName() {
        return "Class "+id;
    }

    public void assignLeader(Student student) {
        leader = student;
    }

    public Student getLeader() {
        return leader;
    }
}
