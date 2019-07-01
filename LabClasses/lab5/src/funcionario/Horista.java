package funcionario;

public class Horista extends Funcionario {
  float totalHoras;
  float valorHora;

  public Horista(String nome, String cpf, String setor) {
    super(nome, cpf, setor);
  }

  /**
   * @return the totalHoras
   */
  public float getTotalHoras() {
    return totalHoras;
  }
  /**
   * @param totalHoras the totalHoras to set
   */
  public void setTotalHoras(float totalHoras) {
    this.totalHoras = totalHoras;
  }

  /**
   * @return the valorHora
   */
  public float getValorHora() {
    return valorHora;
  }
  /**
   * @param valorHora the valorHora to set
   */
  public void setValorHora(float valorHora) {
    this.valorHora = valorHora;
  }

  float calculaSalarioMensal() {
    float horasNormais = 160;
    float adicionalHoraExtra = (float)1.4;
    float salario = 0;

    if(this.totalHoras > 160)
      salario += (totalHoras - horasNormais) * adicionalHoraExtra * valorHora;

    salario += valorHora * totalHoras;

    return salario;
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