package geometria;

public class Triangulo extends Poligono {
  public Triangulo(double ...args) {
    super("triangulo", args);
  }

  @Override
  public double getArea() {
    double[] lados = getLados();
    double semiPerimeter = 0.5 * (lados[0] + lados[1] + lados[2]);

    return Math.sqrt(semiPerimeter * (semiPerimeter - lados[0]) * (semiPerimeter - lados[1]) * (semiPerimeter - lados[2]));
  }

  @Override
  public double getPerimetro() {
    return this.getLados()[0] + this.getLados()[1] + this.getLados()[2];
  }
}