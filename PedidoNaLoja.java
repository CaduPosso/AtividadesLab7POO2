// Subclasse para pedidos realizados na loja
class PedidoNaLoja extends PedidoTemplate {
    @Override
    protected void processarPagamento(double total, String formaPagamento) {
        System.out.println("Processando pagamento na loja de " + total + " em " + formaPagamento);
    }

    @Override
    protected boolean temEntrega() {
        return false; // Pedido na loja não possui entrega
    }
}