
package util.Validacoes;

/**
 *
 * @author rafael
 */
public class ValidacaoCpf {
    public static boolean validarCPF(String cpf) {
    if (cpf == null || !cpf.matches("\\d{11}") || cpf.matches("(\\d)\\1{10}")) {
        return false;
    }
    char[] numeros = cpf.toCharArray();
    int soma = 0;
    for (int i = 0; i < 9; i++) {
        soma += (numeros[i] - '0') * (10 - i);
    }
    int resto = 11 - soma % 11;
    if (resto == 10 || resto == 11) {
        resto = 0;
    }
    if (resto != numeros[9] - '0') {
        return false;
    }
    soma = 0;
    for (int i = 0; i < 10; i++) {
        soma += (numeros[i] - '0') * (11 - i);
    }
    resto = 11 - soma % 11;
    if (resto == 10 || resto == 11) {
        resto = 0;
    }
    if (resto != numeros[10] - '0') {
        return false;
    }
    return true;
}
}
