public class ValidarSenha {

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }
        boolean TemNumero = false;
        char letra = 0;
        for (int i = 0; i < senha.length(); i++) {
            letra = senha.charAt(i);

            if (letra >= '0' && letra <= '9') {
                TemNumero = true;
            }
            
        }
        return TemNumero;
    }
}
