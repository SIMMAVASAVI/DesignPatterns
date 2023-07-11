package prototypeRegistery;

import java.util.HashMap;

public class StudentRegistery {
    HashMap<String, prototypeRegistery.Student> map;

    public StudentRegistery() {
        this.map = new HashMap<>();
    }

    public void register(String key, Student prototype){
        map.put(key,prototype);
    }

    public Student get(String key){
        return map.get(key);
    }
}
