public class Objective6Lab1 {
  public static void main(String[] args) {
    int month = 6;

    switch (month) {
      case 1:
        System.out.println("January");
        break;
        switch(month)
        {
        case "January" :
        case "March" :
        case "May" :
        case "July" :
        case "August" :
        case "October" :
        case "December" : days=31;
        break;
        case "April" :
        case "June" :
        case "September" :
        case "November" : days=30;
        break;
        case "February" : days=28;
        default : days=-1;
        }
        System.out.println(days);
        }
        }
      /*
      Your solution goes here
      */

      default:
        System.out.println("That is not a valid month");
        break;
    }
  }
}
