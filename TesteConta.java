public class TesteConta {
    public static void main(String[] args) {
    
        Conta Conta1 = new Conta( "Bem-vinda" , "Cecilia", 2032,  "02/06/2021", 2200.00, 200);
        System.out.println(Conta1.returninicio() + "," + Conta1.returnnome() + ", Numero da agencia: " + Conta1.returnnumero() + ", Sua data de abertura: " + Conta1.returndata());
        
        Conta1.opcao();

} 
}
    