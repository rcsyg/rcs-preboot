package lv.accenture.preboot.collections;

import java.util.LinkedHashSet;
import java.util.Random;

public class TopicsAssigner {

    public static void main(String[] args) {
        // 1,2,3 - > 2,3,1
        // 3,2,1 - > 2,3,1

        LinkedHashSet<Integer> groupTopics = new LinkedHashSet<>();
        //int r = new Random().nextInt(6) + 1;

        while (groupTopics.size() != 5) {
            int r = new Random().nextInt(5) + 1;
            groupTopics.add(r);
        }

        System.out.println(groupTopics);
    }

}
