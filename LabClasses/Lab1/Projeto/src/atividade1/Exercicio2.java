package atividade1;

public class Exercicio2 {
  public static void main(String[] args) {
    int[] values = randomIntArray(20, 10, 1);

    double mean = mean(values);
    int mode = mode(values);

    System.out.println(mean);
    System.out.println(mode);
  }

  public static int mode(int[] values) {
    int mode = values[0];
    int length = values.length;
    int maxCount = 0;

    for (int i = 0; i < length; i++) {
      int key = values[i];
      int count = 0;

      for (int j = 0; j < length; j++) {
        if(values[j] == key){
          count++;
        }
      }

      if(count > maxCount) {
        mode = key;
        maxCount = count;
      }
    }

    return mode;
  }

  public static double mean(int[] values) {
    double mean = 0;
    int length = values.length;

    for (int i = 0; i < length; i++) {
      mean += ((double)values[i] / length);
    }

    return mean;
  }

  public static int[] randomIntArray(int length, int max, int min) {
    int[] array = new int[length];
    int range = (max - min) + 1;

    for (int i = 0; i < length; i++) {
      array[i] = (int)(Math.random() * range + min);
    }

    return array;
  }
}