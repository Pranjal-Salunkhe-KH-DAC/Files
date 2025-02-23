//Q7. Find the Largest of Three Numbers
class LargestOfThree {
    public static void main(String args[]) {
        int a = 40, b = 70, c = 60;
        int max;

        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The largest number is: " + max);
    }
}

