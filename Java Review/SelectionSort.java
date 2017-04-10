public class SelectionSort{
  public static void main(String arg[]){
    int[] input = {2,1,3,4,5,12,43,22,3,4,5,1,23,123};
    int[] result = selectionSort(input);
    for(int i:result){
      System.out.println(i);
    }
  }
  public static int[] selectionSort(int[] input){
    int length = input.length;
    int temp=0;
    for(int i =0; i<length;i++){
      for(int j=i; j<length;j++){
        System.out.println("\ni: input["+i+"]="+input[i]);
        System.out.println("j: input["+j+"]="+input[j]);
        if(input[j]<input[i]){
          System.out.println("\ni:"+i+" j:"+j+ " switch");
          temp = input[i];
          input[i] = input[j];
          input[j] = temp;
        }
      }
    }
    return input;
  }
}
