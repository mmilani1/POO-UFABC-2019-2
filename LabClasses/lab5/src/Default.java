import funcionario.*;

/**
 * Default
 */
public class Default {
  public static void main(String[] args) {
    Horista h1 = new Horista("Horista1", "13245678909", "TI");
    h1.setTotalHoras(200);
    h1.setValorHora(45);

    Horista h2 = new Horista("Horista2", "13245678909", "TI");
    h2.setTotalHoras(220);
    h2.setValorHora(25);
    
    Horista h3 = new Horista("Horista3", "13245678909", "TI");
    h3.setTotalHoras(160);
    h3.setValorHora(50);
    
    Efetivo e1 = new Efetivo("Efetivo1", "12345678909", "Tech");
    e1.setSalario(5000);
    e1.setHorasExtras(20);

    Efetivo e2 = new Efetivo("Efetivo2", "12345678909", "Tech");
    e2.setSalario(5000);
    e2.setHorasExtras(0);

    System.out.println(h1.toString());
    System.out.println(h2.toString());
    System.out.println(h3.toString());
    System.out.println(e1.toString());
    System.out.println(e2.toString());
  }
}