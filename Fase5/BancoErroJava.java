package Fase5;

public class BancoErroJava {
    public static void main(String[] args){
        Conta conta = new Conta();

        try{
            conta.sacar(99.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro do banco: " + e.getMessage());
        }
    }
}
