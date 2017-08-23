
import java.util.*;


public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        Double total = 0.0;
        for (int i = 0; i < n; i++) {
            int stud = scanner.nextInt();
            arr.add(stud);
            total = total + stud;
        }
        for (int i = 0; i < n; i++) {
            Double cakes = (arr.get(i) / total) * (b * 1.0);
            int temp = (int) Math.ceil(arr.get(i) / cakes);
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(max);


    }
}
