public class Calculator{
  public int add(int numA, int numB){
    return numA + numB;
  }

  public int sub(int numA, int numB){
    return numA - numB;
  }
  public int multiple(int numA, int numB){
    return numA * numB;
  }
  public int divison(int numA, int numB){
    if (numB == 0) {
      System.out.println("Tidak Bisa bagi 0");
      return 0;
    }
    return numA / numB;
  }

}