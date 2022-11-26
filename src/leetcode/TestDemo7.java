package leetcode;

import java.util.HashSet;
import java.util.Set;

/*495. Teemo Attacking
Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.

You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.

Return the total number of seconds that Ashe is poisoned.


 */
public class TestDemo7 {

    public static void main(String[] args) {
        int[] num = {1,2};
        int duration=3;
        int i = findPoisonedDuration(num, duration);
        System.out.println(i);
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < timeSeries.length; i++) {
            for (int j = 0; j < duration; j++)
                set.add(timeSeries[i] + j);

        }
        return set.size();
    }
}

