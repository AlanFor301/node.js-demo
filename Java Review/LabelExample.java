public class LabelExample{
  public static void main(String arg[]){
    aa:
      for(int i = 1; i<=3; i++){
        bb:
          for(int j = 1; j<=3; j++){
            if(i==2&&j==2){
              break bb;
            }
            System.out.println("i is "+i+". j is "+ j);
          }
      }
    int a[] = {1,2,3,4,5,6,7,8,9};
    for(int i:a){
      System.out.println("digit iteration: " + i);
    }
  }
}
