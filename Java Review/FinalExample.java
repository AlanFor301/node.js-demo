public class FinalExample{
  public static void main(String arg[]){
    final int digit = 10;
    try{
      //digit += 1;
      System.out.println("final type cannot be changed; \notherwise it will occour compiling error.");
    }catch(Exception e){
      System.out.println(e);
    }finally{
      System.out.println("digit cant be changed.");
    }
  }
}
