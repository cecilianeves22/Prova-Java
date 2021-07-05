import java.util.*;

class Conta {
    String inicio;
    String nome;
    int numero;
    String data;
    int sacar;
    int depositar;
    double saldo;
    double rendimento;
    int opcao; //1 2 3 
    int mes;
    
    Scanner sc = new Scanner(System.in); 
   
    //Método construtor

    public Conta( String inicio, String nome, int numero, String data, double saldo, int depositar) {
        this.inicio = inicio;
        this.nome = nome;
        this.numero = numero;                           
        this.opcao = opcao;
        this.saldo = saldo;
        this.data = data; 

    }   
                  
    static void inicio() {
        System.out.println("Bem-vindo ao Banco Neves");
        inicio();
    }

    public void opcao() {
        System.out.println("O que deseja realizar?: \n 1- Sacar: \n 2 - Depositar:  \n 3 - Saldo \n 4 - Rendimento:");
        opcao = sc.nextInt ();

        switch (opcao){
            case 1:
            System.out.println( "Qual o valor que deseja sacar?" + "Saldo atual:" + saldo );
            sacar = sc.nextInt (); 
            saldo = saldo - sacar;
            System.out.println("Seu saldo atual:" + saldo);
            break;

            case 2:
            System.out.println("Qual valor deseja depositar?" + "Saldo atual:" + saldo );
            depositar = sc.nextInt ();
            saldo = depositar + saldo;
            System.out.println("Seu saldo atual é:" + saldo);
            break;

            case 3:
            System.out.print ("\nSeu saldo é de: R$ " + saldo);
            saldo = sc.nextInt();

            case 4:
            System.out.println("Vamos realiza uma simulação de rendimento" + "Seu saldo:" + saldo);
            System.out.println("O seu dinheiro tem um rendimento de 0.05% mensalmente, vamos fazer uma simulação de quanto ele renderia \n Digite quantos meses você pretende deixar ele na poupança : ");
            mes = sc.nextInt();
            saldo =  (mes* 0.05) + saldo;
            System.out.println("Seu saldo atual e de: " + saldo );
            
            break;
        }
    }

        public String returninicio (){
            return this.inicio;
        }

        public String returnnome (){
            return this.nome;
        }

        public int returnnumero() {
            return this.numero;
        }

      
        
        public Double returnrendimento() {
            return this.rendimento;
        }
        
        public String returndata() {
            return this.data;
        }
        
    

        public Double saldo(){
            return saldo = 2200.00;
        }

    }