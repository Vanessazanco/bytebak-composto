public class TestaBancoSemCLiente {
    public static void main(String[] args) {
        Conta contaTeste = new Conta();
        System.out.println(contaTeste.saldo);

        contaTeste.titular = new Cliente();
        System.out.println(contaTeste.titular);

        contaTeste.titular.nome="Teste";
        System.out.println(contaTeste);
    }
}
