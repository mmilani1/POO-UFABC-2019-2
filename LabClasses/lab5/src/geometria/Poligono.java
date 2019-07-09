package geometria;

/**
 * Poligono
 */
abstract public class Poligono extends FiguraPlana {
  private double lados[];

  public Poligono(String tipo, double ...args) {
    super(tipo);
    this.lados = args;
  }

  public double[] getLados() {
    return lados;
  }

  abstract public double getArea();
  abstract public double getPerimetro();
}