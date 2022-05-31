public class ContaPoupanca extends Conta{
  
     private String numeroConta;
     private int numero = 123456789;

    public ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);

        numeroConta = Integer.toString(numero) + "-1";
        numero++;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Numero da conta: " + numeroConta);
    }

    
}
