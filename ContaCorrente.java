public class ContaCorrente extends Conta{
   
    private String numeroConta;
    public static int numero = 1234567;

    public ContaCorrente(String nome, double saldo){ 
       super(nome, saldo);

       numeroConta = Integer.toString(numero) + "-2";
       numero++;         
}

    @Override
    public void info(){
        super.info();
        System.out.println("Numero da conta: " + numeroConta);
    }
}

