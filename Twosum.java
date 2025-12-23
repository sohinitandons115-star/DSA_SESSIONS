import java.util.HashMap;
import java.util.Scanner;

class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                System.out.println("Indices: " + map.get(needed) + " " + i);
                found = true;
                break;
            }

            map.put(nums[i], i);
        }

        if (!found) {
            System.out.println("No two elements add up to target");
        }

        sc.close();
    }
}
