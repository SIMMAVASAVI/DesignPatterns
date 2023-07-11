package prototypeRegistery;

import java.util.HashMap;

public class StudentRegistery {
    HashMap<String, prototypeRegistery.Student> map;

    public StudentRegistery(HashMap<String, Student> map) {
        this.map = map;
    }

    public void register(String key, Student prototype){
        map.put(key,prototype);
    }
}
