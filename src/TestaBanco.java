public class TestaBanco {
    public static void main(String[] args) {
        Cliente vanessa = new Cliente();
        vanessa.nome ="Vanessa Z";
        vanessa.cpf ="111.111.111-11";
        vanessa.profissao ="Dev Jr.";

        Conta contaV = new Conta();
        contaV.deposita(100);

            // assosia o cliente a conta contaV
        contaV.titular=vanessa;

        System.out.println(contaV.titular.nome);
        System.out.println(contaV.titular);
        System.out.println(vanessa);
    }
}