// Subclasse para pedidos online
class PedidoOnline extends PedidoTemplate {
    @Override
    protected void processarPagamento(double total, String formaPagamento) {
        System.out.println("Processando pagamento online de " + total + " via " + formaPagamento);
    }

    @Override
    protected boolean temEntrega() {
        return true;
    }
}