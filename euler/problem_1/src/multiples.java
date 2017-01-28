import java.util.ArrayList;

class FindMultiples {
    public static void main(String[] args) {
        int upTo = 1000;
        int sum = 0;
        ArrayList<Integer> correctNums = new ArrayList<>();
        for (int i = 0; i < upTo; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                correctNums.add(i);
            }
        }
        for (int a = 0; a < correctNums.size(); a++) {
            sum += correctNums.get(a);
        }
        System.out.println(sum);
    }
}
