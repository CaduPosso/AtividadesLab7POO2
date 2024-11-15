// O padrão Template define a estrutura de um algoritmo em uma classe abstrata,
// permitindo que subclasses implementem detalhes específicos dos passos do algoritmo.
// Já o padrão Decorator adiciona comportamentos ou responsabilidades a objetos de forma
// dinâmica, sem alterar a estrutura básica da classe ou a interface. Enquanto o Template
// se foca na estrutura do algoritmo e permite personalização de passos, o Decorator
// adiciona funcionalidades sem mudar a estrutura do código original.

public class Main {
    public static void main(String[] args) {
        PedidoTemplate pedidoOnline = new PedidoOnline();
        pedidoOnline.processarPedido(3, 50, "cartão");

        PedidoTemplate pedidoLoja = new PedidoNaLoja();
        pedidoLoja.processarPedido(2, 100, "dinheiro");

        PedidoTemplate pedidoCripto = new PedidoCripto();
        pedidoCripto.processarPedido(5, 20, "criptomoeda");
    }
}