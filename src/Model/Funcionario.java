package Model;

    public class Funcionario extends Pessoa{
        
        // Atributos classe Funcionario
        private String endereco;
        private String complemento;
        private String cep;
        private String senha;
        private String nivelAcesso;
        
        
        // Construtores 
    public Funcionario(int id, String nome, String sexo, String dataNascimento, String cpf, String telefone, String email, String cep, String endereco, String complemento, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, cpf, telefone, email);
        this.endereco = endereco;
        this.complemento = complemento;
        this.cep = cep;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Funcionario(String nome, String sexo, String dataNascimento, String cpf, String telefone, String email, String cep, String endereco, String complemento, String senha, String nivelAcesso) {
        super(nome, sexo, dataNascimento, cpf, telefone, email);
        this.endereco = endereco;
        this.complemento = complemento;
        this.cep = cep;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

        // Construtor para autenticação de Usuario.
    public Funcionario(String email, String senha) {
        super(email);
        this.senha = senha;
    }
    
    

    
        // Getters e Setters para acessar atributos da classe.
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
        
        
    
}
