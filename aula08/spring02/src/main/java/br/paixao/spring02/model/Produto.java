package br.paixao.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //será armazenado no banco de dados
@Table(name = "produto")
public class Produto {
    
    @Id // chave primária no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto enumerado no BD com 1, 2, 3....
    @Column(name = "cod")
    private long codigo; //Número inteiro com tamanho bem maior que um int

    @Column(name = "nome", length = 200, nullable = false) //NOME, TAMANHO, CAMPO OBRIGATÓRIO
    private String nome;
    
    @Column(name = "valor")
    private double valor;

    @OneToOne
    @JoinColumn(name = "id_fornecedor") //Criar ou usar uma coluna existente para fazer o Join entre elas
    @JsonIgnoreProperties("produtos")
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    
}
