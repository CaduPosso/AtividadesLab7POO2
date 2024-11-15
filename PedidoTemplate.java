// Classe Template que define o algoritmo do processamento de pedido
abstract class PedidoTemplate {
    public final void processarPedido(int quantidade, double valorPorItem, String formaPagamento) {
        double total = calcularTotal(quantidade, valorPorItem);
        processarPagamento(total, formaPagamento);
        if (temEntrega()) {
            realizarEntrega();
        }
    }

    private double calcularTotal(int quantidade, double valorPorItem) {
        return quantidade * valorPorItem;
    }

    protected abstract void processarPagamento(double total, String formaPagamento);
    
    protected boolean temEntrega() {
        return false; // padrão sem entrega, pode ser sobrescrito
    }

    protected void realizarEntrega() {
        System.out.println("Pedido será entregue no endereço do cliente.");
    }
}