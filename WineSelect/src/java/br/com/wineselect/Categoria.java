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
public class Categoria {
    private int categoriaId;
    private int categoriaTipoId;
    private String categoriaDescricao;

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public int getCategoriaTipoId() {
        return categoriaTipoId;
    }

    public void setCategoriaTipoId(int categoriaTipoId) {
        this.categoriaTipoId = categoriaTipoId;
    }

    public String getCategoriaDescricao() {
        return categoriaDescricao;
    }

    public void setCategoriaDescricao(String categoriaDescricao) {
        this.categoriaDescricao = categoriaDescricao;
    }
}
