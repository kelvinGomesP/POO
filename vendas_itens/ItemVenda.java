package vendas_itens;

package br.com.exemplo.vendas.model;
public class ItemVenda {
	private double valorUnitario;
    private double quantidade;

    public ItemVenda(String descricao, double valorUnitario, double quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return valorUnitario * quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
}
