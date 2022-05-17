/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gusta
 */
@Entity
@Table(name = "tab_categoria_produto")
@NamedQueries({
@NamedQuery(name = "CategoriaProduto.finfAll",query = "SELECT c FROM CategoriaProduto c"),
@NamedQuery(name = "CategoriaProduto.finfById",query = "SELECT c FROM CategoriaProduto c WHERE c.id = :codigo")
})
public class CategoriaProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 100, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoriaProduto")
    private ArrayList<Produto> produtos;

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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public CategoriaProduto() {
    }

    public CategoriaProduto(int id, String nome, ArrayList<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.produtos = produtos;
    }

    public CategoriaProduto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


}
