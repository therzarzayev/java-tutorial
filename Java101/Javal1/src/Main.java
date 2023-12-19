import etc.Data;
import etc.school.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(6);
        data.add(7);
        data.add(8);
        data.add(9);
        data.add(10);
        for (Integer datum : data) {
            System.out.println(datum.toString());
        }
    }
}