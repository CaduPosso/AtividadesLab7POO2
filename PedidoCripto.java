// Subclasse para pedidos com pagamento via criptomoedas
class PedidoCripto extends PedidoTemplate {
    @Override
    protected void processarPagamento(double total, String formaPagamento) {
        System.out.println("Processando pagamento de " + total + " em criptomoedas.");
    }

    @Override
    protected boolean temEntrega() {
        return true;
    }
}