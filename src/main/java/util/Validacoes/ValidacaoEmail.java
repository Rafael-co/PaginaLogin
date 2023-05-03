
package util.Validacoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

/**
 *
 * @author rafael
 */
public class ValidacaoEmail {
      private static final Pattern EMAIL_REGEX = Pattern.compile(
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
    );

    public static boolean validar(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        Matcher matcher = EMAIL_REGEX.matcher(email);
        return matcher.matches();
    }
}
