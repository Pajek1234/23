import java.util.Random;;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int suma = 0;
    for (int i = 0; i < 5; i++) {
      int randomNumber = random.nextInt(101);
      System.out.println(randomNumber);
      suma += randomNumber;
    }
    System.out.println(suma);
  }
}