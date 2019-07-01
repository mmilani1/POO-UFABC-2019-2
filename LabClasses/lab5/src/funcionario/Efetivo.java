package funcionario;

public class Efetivo extends Funcionario {
  float salario;
  float horasExtras;

  public Efetivo(String nome, String cpf, String setor) {
    super(nome, cpf, setor);
  }

  /**
   * @return the salario
   */
  public float getSalario() {
    return salario;
  }
  /**
   * @param salario the salario to set
   */
  public void setSalario(float salario) {
    this.salario = salario;
  }

  /**
   * @return the horasExtras
   */
  public float getHorasExtras() {
    return horasExtras;
  }
  /**
   * @param horasExtras the horasExtras to set
   */
  public void setHorasExtras(float horasExtras) {
    this.horasExtras = horasExtras;
  }

  float calculaSalarioMensal() {
    float valorHora = this.salario / 40;
    float adicionalHoraExtra = (float)1.5;

    float salarioFinal = this.salario;

    if(this.horasExtras > 0)
      salarioFinal += this.horasExtras * adicionalHoraExtra * valorHora;

    return salarioFinal;
  }

  @Override
  public String toString() {
    String nome = this.getNome();
    String cpf = this.getCpf();
    String setor  = this.getSetor();
    
    float salario = calculaSalarioMensal();

    return  "Nome: " + nome +
            "\nCPF: " + cpf +
            "\nSetor: " + setor +
            "\nSalario: " + salario;
  }
}