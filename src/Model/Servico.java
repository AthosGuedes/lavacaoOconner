package Model;

public class Servico {
  
        // Atributos da classe Servico
    private int id;
    private String nome; 
    private String descricao;
    private String valor;
    
    
        // Construtores 
    public Servico(int id, String nome, String descrição, String valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descrição;
        this.valor = valor;
    }

    public Servico(String nome, String descrição, String valor) {
        this.nome = nome;
        this.descricao = descrição;
        this.valor = valor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
        
}
