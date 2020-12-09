import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine()
                .trim()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> out = new ArrayList<>();
        int num = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i : input) {
            final int distance = Math.abs(num - i);
            if (distance < min) {
                min = distance;
                out.clear();
                out.add(i);
            } else if (distance == min) {
                out.add(i);
            }
        }
        Collections.sort(out);
        for (int i : out) {
            System.out.print(i + " ");
        }
    }
}