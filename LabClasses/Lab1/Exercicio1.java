public class Exercicio1 {
  public static void main(String[] args) {
    double pi = getPI(50);

    System.out.println(pi);
  }

  public static double getPI(int n) {
    double sum = 0;

    for (int i = 0, divisor = 1; i < n; i++, divisor += 2) {
      if (i % 2 == 0) {
        sum += (1 / (double)divisor);
      } else {
        sum -= (1 / (double)divisor);
      }
    }

    return 4 * sum;
  }
}