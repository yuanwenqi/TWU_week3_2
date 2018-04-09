package practice07;

public class Klass {
    int id;
    public  Klass(int myid){
        id = myid;
    }
    public int getNumber() {
        return id;
    }

    public String  getDisplayName() {
        return "Class "+id;
    }
    public Boolean isEqualTo(Klass Klass2){
        if (id == Klass2.id){
            return  true;
        }else {
            return false;
        }

    }
}
