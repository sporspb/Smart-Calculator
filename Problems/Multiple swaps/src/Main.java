import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.asList(scanner.nextLine().split("\\s+"));
        int numSwap = scanner.nextInt();
        for (int i = 0; i < numSwap; i++) {
            Collections.swap(input, scanner.nextInt(), scanner.nextInt());
        }
        input.forEach(s -> System.out.print(s + " "));
    }
}