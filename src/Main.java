import ibadts.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int noOfElements = 0;

        Queue<String> queue = new Queue<>();
        Scanner scanner = new Scanner(System.in);

        queue.add(scanner.nextLine().split(" "));
        while (!queue.isEmpty()) {
            noOfElements++;
            queue.dequeue();
        }

        System.out.println("No of elements in the given queue: " + noOfElements);
    }
}