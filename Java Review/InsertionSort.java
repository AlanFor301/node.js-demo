public class InsertionSort{
  public static void main(String arg[]){
    int[] input = {2,1,3,4,5,12,43,22,3,4,5,1,23,123};
    int[] result = insertionSort(input);
    for(int i:result){
      System.out.println(i);
    }
  }
  public static int[] insertionSort(int[] input){
    int length = input.length;
    int temp;
    int prev_temp;
    for(int i=0; i<length; i++){

      for(int j=0; j<i; j++){
        System.out.println("\ninput["+i+"] is: "+ input[i]+"; input["+j+"] is: "+ input[j]);
        temp = input[i];
        if(temp <= input[i-j]){
          input[i-j+ 1] = input[i-j];
        }else{
          input[i-j] = temp;
        }
      }
    }
    return input;
  }
}
