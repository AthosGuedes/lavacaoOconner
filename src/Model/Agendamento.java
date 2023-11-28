package Model;

public class Agendamento {
    
    // Atributos da classe Agendamento
    private int id;
    private String nome_cliente;
    private String nome_servico;
    private String valor;
    private String data;
    private String hora;
    private String observacao;

        // Construtores 
    public Agendamento(int id, String nome_cliente, String nome_servico, String valor, String data, String hora, String observacao) {
        this.id = id;
        this.nome_cliente = nome_cliente;
        this.nome_servico = nome_servico;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
    }

    public Agendamento(String nome_cliente, String nome_servico, String valor, String data, String hora, String observacao) {
        this.nome_cliente = nome_cliente;
        this.nome_servico = nome_servico;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
    }

        // Construtor para cancelamento.
    public Agendamento(int id) {
        this.id = id;
    }

    
    
    
        // Getters e Setters para acessar atributos da classe.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }
    
    
    
    
    
    
    
    
}
