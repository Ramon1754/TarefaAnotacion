package br.com.ramon.exceptions.Job18;

public @interface Tabela {
    String nome();

    public class Exemplo {

        @Tabela(nome = "Cliente")

        public void processarDadosClientes() {
            System.out.println("Processando dados da tabela Clientes...");
        }

        @Tabela(nome = "Pedidos")
        public void processarDadosPerdidos() {
            System.out.println("Processando dados da tabrla Pedidos...");
        }

        public static void main(String[] args) {
            Exemplo exemplo = new Exemplo();
            exemplo.processarDadosClientes();
            exemplo.processarDadosPerdidos();
        }
    }
}
