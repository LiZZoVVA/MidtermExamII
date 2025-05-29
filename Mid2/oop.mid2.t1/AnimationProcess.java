package oop.mid2.t1;

import java.util.*;

/**
 * This program simulates a process where:
 * 
 *   - list1 is initialized with 17 numeric values.
 *   - list2 is randomly populated with numeric values from list1.
 *   - list3 is randomly populated with 12 string values chosen from a predefined list of strings.
 *   - list3 then has its elements removed starting from index 0, then index 1 (after refresh),
 *     then index 2 (after refresh), and so on, until only 5 values remain.
 *
 * This structure is inspired by an animation of interchanging values between three lists.
 *
 *
 */
public class AnimationProcess {
    /**
     * Main method which performs the transformation process between the lists.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Random random = new Random();

        // Step 1: list1 with 17 numeric values
        List<Integer> list1 = Arrays.asList(8, 6, 2, 2, 9, 6, 3, 7, 7, 5, 7, 5, 8, 4, 3, 1, 0);

        // Step 2: original string list (used only for list3)
        List<String> originalStrings = Arrays.asList(
                "RorE", "oJI", "WY2", "CmJ", "x62U", "UjFRw", "j6b4", "qi9", "2xD",
                "1XSV4", "B191y", "h7J6L", "YsLt", "cX9V", "oHFFT", "KgHH", "GRYT", "Str"
        );

        // Step 3: Fill list2 with values from list1 in random positions
        List<Object> list2 = new ArrayList<>();
        for (Integer value : list1) {
            int position = random.nextInt(list2.size() + 1);
            list2.add(position, value);
        }

        // Step 4: Randomly select 12 strings from originalStrings to put into list3
        List<Object> list3 = new ArrayList<>(Collections.nCopies(12, null));
        List<String> shuffledStrings = new ArrayList<>(originalStrings);
        Collections.shuffle(shuffledStrings);

        int count = Math.min(12, shuffledStrings.size());
        for (int i = 0; i < count; i++) {
            int pos;
            do {
                pos = random.nextInt(12);
            } while (list3.get(pos) != null);
            list3.set(pos, shuffledStrings.get(i));
        }

        System.out.println("Before deletion:");
        System.out.println("List1 (Integers): " + list1);
        System.out.println("List2 (Random Integers from list1): " + list2);
        System.out.println("List3 (Random Strings): " + list3);

        // Step 5: Deletion process on list3
        int deleteIndex = 0;
        while (list3.size() > 5) {
            if (deleteIndex >= list3.size()) {
                deleteIndex = list3.size() - 1;
            }
            list3.remove(deleteIndex);
            deleteIndex++;
        }

       
        System.out.println("List3 (After reducing to 5 values): " + list3);
    }
}

