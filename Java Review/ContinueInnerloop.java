public class ContinueInnerloop{
  public static void main(String arg[]){
    for(int i=1; i<=3; i++){
      for(int j=1; j<=3; j++){
        if(j==2){
          continue;
        }
        System.out.println("i is: "+i + "; j is: "+j);
      }
    }
  }
}
