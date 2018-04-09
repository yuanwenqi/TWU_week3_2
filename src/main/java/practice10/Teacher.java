package practice10;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.google.common.collect.Sets;

public class Teacher {
    private int id;
    private String name;
    private int age;
    private HashSet<Klass> Set;


    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Teacher(int id, String name, int age, HashSet<Klass> set) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Set = set;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HashSet getClasses(){
        return this.Set;
    }


    public String introduce() {
        if (this.Set == null){
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach No Class.";
        }else{
            List<String> list=  new ArrayList<>();
            for(Klass i:this.Set){
                list.add(""+i.getNumber());
            }
            Collections.sort(list);
            String s = String.join(", ",list);
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach Class "+s+".";
        }
    }


    public boolean isTeaching(Student student) {
        return this.Set.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)){
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I teach "+student.getName()+".";
        }else{
            return  "My name is "+name+". I am "+age+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}