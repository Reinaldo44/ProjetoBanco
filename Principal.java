public class Principal {

   
    public static void main(String[] args) {


        ContaCorrente cReinaldo = new ContaCorrente("Reinaldo", 2000);
        ContaCorrente cBruno = new ContaCorrente("Bruno", 3000); 
        ContaCorrente cMae = new ContaCorrente("Lurdes", 10000);
        ContaPoupanca Naldo = new ContaPoupanca("Rafa", 500);  
          
        try {
    
            Naldo.Depositar(300.0);
            cReinaldo.Depositar(1000.00);
            cBruno.Depositar(1200.00);
            cReinaldo.Sacar(200.89);
            cBruno.Sacar(500.90);
            Naldo.info();
            cMae.info();
            cReinaldo.info();
            cBruno.info();
            
            
        } catch (Exception e) {
            
            System.out.println("Ocorreu um erro.");
            System.out.println(e.getMessage());   
           
        }
       
        }
    
}
