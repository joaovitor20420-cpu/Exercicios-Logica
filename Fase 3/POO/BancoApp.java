package POO;

public class BancoApp {
    public static void main(String[] args){

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.titular = "João";
        contaBancaria.saldo = 0;
        contaBancaria.depositar(10);
        contaBancaria.sacar(5.50);
    }
}
