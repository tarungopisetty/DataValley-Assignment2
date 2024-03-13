public class Divisibleby5{
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;
        for (int value : values) {
            if (value % 5 == 0 && value % 2 == 0) {
                sum += value;
            }
        }
        System.out.println("The sum of the numbers divisible by 5 and 2 is: " + sum);
    }
}