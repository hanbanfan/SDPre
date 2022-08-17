import java.util*;

    public class Objective3Lab2 {

        static double hypotenuse(double side1,double side2)
        {
            //pythogoras thorem to caluclate the hypotenuse length
            double hypotenuses = Math.sqrt(side1*side1 + side2*side2);

            return hypotenuses;

        }
        //driver function
        public static void main(String []args)
        {

            Scanner sc  = new Scanner(System.in); //scanner object to take user input

            System.out.println("Enter side one");
            double side1 = sc.nextDouble(); //side one

            System.out.println("Enter side two");
            double side2 = sc.nextDouble(); //side two

            System.out.println("Hypotenuse length is "+hypotenuse(side1,side2));


        }

       }
