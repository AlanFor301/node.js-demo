public class Palindrome{
  public static void main(String arg[]){
    //new StringBuilder(hi).reverse().toString()
    String input = "012333210";
    String input_poly = null;
    if(input.length()%2==0){
      //x = x.substring(0, 4) + "." + x.substring(4, x.length());
      //http://stackoverflow.com/questions/5884353/insert-a-character-in-a-string-at-a-certain-position
      input_poly = input.substring(0,input.length()/2) + "M" +input.substring(input.length()/2,input.length());
    }else{
      input_poly= input;
    }


    String first_string = input_poly.substring(0, input_poly.length()/2);
    String second_string = new StringBuilder(input_poly.substring(input_poly.length()/2+1, input_poly.length())).reverse().toString();

    System.out.println("\nfirst "+ first_string);
    System.out.println("\nsecond "+ second_string);
    if(first_string.equals(second_string)){
      System.out.println("\n"+ input + " is a palindrome");
    }else{
      System.out.println("\n"+ input + " is NOT a palindrome");
    }

  }
}
