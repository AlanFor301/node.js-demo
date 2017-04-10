public class BubbleSort{
  public static void main(String arg[]){
    int[] input = {2,1,3,4,5,12,43,22,3,4,5,1,23,123};
    int[] result = bubbleSort(input);
    for(int i:result){
      System.out.println(i);
    }
  }
  public static int[] bubbleSort(int[] input){
    int[] result;
    int temp = 0;
    int array_length = input.length;
    for (int i = 0; i < array_length; i++) {
            for (int j = 1; j < (array_length - i); j++) {

                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }

            }
        }
    result = input;
    return result;
  }
}
