/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wineselect;

/**
 *
 * @author Usuário Convidado
 */
public class Produto {
    private int produtoId;
    private int categoriaId;
    private String produtoDescricao;
    private double produtoValor;
    private double produtoPeso;

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public double getProdutoPeso() {
        return produtoPeso;
    }

    public void setProdutoPeso(double produtoPeso) {
        this.produtoPeso = produtoPeso;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }
    
}
