import java.util.;
class Objective5Lab4
{
    public static void main(String[] args)
    {
        int testNum;
        int remainder;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!\n\nEnter a number and " + "I'll report back if it's \"even\"!\n");
        System.out.print("Please enter a whole number: ");
        testNum = in.nextInt();
        remainder = testNum % 2;

        if (remainder == 0 ) {

            System.out.println(testNum + " is even.");

        }
    }
}
