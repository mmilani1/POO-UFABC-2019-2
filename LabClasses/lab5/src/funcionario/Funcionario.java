package funcionario;

/**
 * Funcionario
 */
public class Funcionario {
  private String nome;
  private String cpf;
  private String setor;
  
  Funcionario(String nome, String cpf, String setor){
    this.nome = nome;
    this.cpf = cpf;
    this.setor = setor;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getCpf() {
    return cpf;
  }
  
  public void setSetor(String setor) {
    this.setor = setor;
  }
  public String getSetor() {
    return setor;
  }
}