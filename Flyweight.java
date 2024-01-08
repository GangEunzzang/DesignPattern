package designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private static Map<String, Subject> map = new HashMap<>();
    public Subject getSubject(Subject subject) {
        String key = subject.name + subject.age;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        map.put(key, subject);
        return subject;

    }
}


