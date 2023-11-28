package Model;

    public class Cliente extends Pessoa {
        
        // Atributos classe Cliente
        private String cep;
        private String endereco;
        private String complemento;
        
        
        // Contrutores 
    public Cliente(int id, String nome, String sexo, String dataNascimento, String cpf, String telefone, String email, String cep, String endereco, String complemento) {
        super(id, nome, sexo, dataNascimento, cpf, telefone, email);
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public Cliente(String nome, String sexo, String dataNascimento, String cpf, String telefone, String email, String cep, String endereco, String complemento) {
        super(nome, sexo, dataNascimento, cpf, telefone, email);
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
    }
    

    
        // Getters e Setters para acessar atributos da classe.
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

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
        
    
}
