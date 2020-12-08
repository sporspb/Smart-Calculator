import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursStart = scanner.nextInt();
        int minStart = scanner.nextInt();
        int secStart = scanner.nextInt();
        int hoursStop = scanner.nextInt();
        int minStop = scanner.nextInt();
        int secStop = scanner.nextInt();
        int hours = (hoursStop - hoursStart) * 3600;
        int min = (minStop - minStart) * 60;
        int sec = secStop - secStart;

        System.out.println(hours + min + sec);
    }
}