package criafigura;

import geometria.*;

public class Default {
  public static void main(String[] args) {
    Circulo circulo = new Circulo(5.0);
    Quadrado quadrado = new Quadrado(2.0);
    Retangulo ret = new Retangulo(2.0, 4.0);
    Triangulo tri = new Triangulo(3.0, 4.0, 5.0);

    System.out.println(circulo.toString());
    System.out.println(quadrado.toString());
    System.out.println(ret.toString());
    System.out.println(tri.toString());
  }
}