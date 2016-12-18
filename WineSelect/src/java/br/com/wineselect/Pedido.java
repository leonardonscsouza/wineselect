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
public class Pedido {
    private int pedidoId;
    private String pedidoObservacao;
    private double pedidoValorTotal;

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getPedidoObservacao() {
        return pedidoObservacao;
    }

    public void setPedidoObservacao(String pedidoObservacao) {
        this.pedidoObservacao = pedidoObservacao;
    }

    public double getPedidoValorTotal() {
        return pedidoValorTotal;
    }

    public void setPedidoValorTotal(double pedidoValorTotal) {
        this.pedidoValorTotal = pedidoValorTotal;
    }
    
    
}
