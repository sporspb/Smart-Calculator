import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.asList(scanner.nextLine().split("\\s+"));
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i < input.size(); i += 2) {
            output.add(Integer.valueOf(input.get(i)));
        }
        Collections.reverse(output);
        output.forEach(s -> System.out.print(s + " "));
    }
}