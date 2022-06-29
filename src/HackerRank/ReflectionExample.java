package src.HackerRank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class ReflectionExample {
    public static void main(String[] args) {
        Class teacher=Teacher.class;
        Method[] methods= teacher.getMethods();

        ArrayList<String> methodList=new ArrayList<>();
        for(Method m:methods){
            methodList.add(m.getName());
        }

        Collections.sort(methodList);

        for(String name:methodList){
            System.out.println(name);
        }

    }
}
