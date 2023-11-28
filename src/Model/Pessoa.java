
package Model;

    abstract public class Pessoa {
        
        // Atributos classe Pessoa
        protected int id;
        protected String nome;
        protected String sexo;
        protected String dataNascimento;
        protected String cpf;
        protected String telefone;
        protected String email;


        // Construtores 
    public Pessoa(int id, String nome, String sexo, String dataNascimento, String cpf, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Pessoa(String nome, String sexo, String dataNascimento, String cpf, String telefone, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    
    
        // Getters e Setters para acessar atributos da classe.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

        
}
