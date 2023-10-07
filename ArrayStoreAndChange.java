import java.util.Scanner;

public class ArrayStoreAndChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter 5 elements in the array");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter value " + (i + 1) + " :");
            num[i] = sc.nextInt();
        }

        System.out.println("Array without adding 10:");
        for (int element : num) {
            System.out.print(element +" ");
        }

        add10(num);
        System.out.println();
        System.out.println("Array with adding 10:");
        for (int element : num) {
            System.out.print(element + " ");
        }
    }

    static void add10(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }
}
