package geometria;

abstract class FiguraPlana {
  private String tipo;

  public FiguraPlana(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  abstract public double getArea();
  abstract public double getPerimetro();

  @Override
  public String toString() {
    return  "Tipo: " + getTipo() +
            "\nArea: " + getArea() +
            "\nPerimetro: " + getPerimetro();
  }
}