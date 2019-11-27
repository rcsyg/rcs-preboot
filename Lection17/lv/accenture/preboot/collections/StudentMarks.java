package lv.accenture.preboot.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StudentMarks {

    public static void main(String[] args) {
        HashMap<String, List<Integer>> studentMarks = new HashMap<>();
        studentMarks.put("Janis Berzins", Arrays.asList(7, 4, 8, 9, 6, 10, 10));
        studentMarks.put("Vasya Pupkin", Arrays.asList(4, 5, 4, 5, 1, 6, 5, 4));
        studentMarks.put("Pupka Vasykin", Arrays.asList(9, 10, 10, 10, 8, 10, 9));

        // Calculate & print average mark for each student
        for(String studentName : studentMarks.keySet()) {
            List<Integer> marks = studentMarks.get(studentName);

            double sum = 0;
            for(Integer mark : marks) {
                sum += mark;
            }

            double avg = sum / marks.size();
            System.out.println("Student : " + studentName + " : " + avg);
        }
    }

}
