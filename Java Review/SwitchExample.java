public class SwitchExample{
  public static void main(String argp[]){
    int initial_digit = 10;
    switch(initial_digit){
      case 10:
        System.out.println("\nwith break 10");
        break;
      case 20:
        System.out.println("with break 20");
        break;
      case 30:
        System.out.println("with break 30");
        break;
      }
      switch(initial_digit){
        case 10:
          System.out.println("\nwithOUT break 10");
        case 20:
          System.out.println("withOUT break 20");
        case 30:
          System.out.println("withOUT break 30");

      }
    }
}
