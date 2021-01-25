package Password;

import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Password {
    /*
    Crear una clase Password. El constructor debe recibir una regex (expresión regular)
    que valide el formato requerido para la contraseña. Investigar en Internet qué
    recursos provee Java para operar con expresiones regulares.

    Posible regex: "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"
    ++Al menos 8 caracteres
    ++Contiene al menos un dígito
    ++Contiene al menos un carácter alfa inferior y un carácter alfa superior
    ++Contiene al menos un carácter dentro de un conjunto de caracteres especiales ( @#%$^etc.)
     */

    private String password;
    private Pattern regex;

    public  Password(){}

    public Password(String regex){
        this.regex = Pattern.compile(regex);
    }

    public void setValue(String pwd){
        /*
        Agregar el método public void setValue(String pwd) que permite asignar una
        contraseña acorde a la requerida por la regex del punto anterior. En caso de no
        concordar, el método debe arrojar una excepción.
         */
        try {
            Matcher m = this.regex.matcher(pwd);
            boolean b = m.matches();
            if (b) {
                this.password = pwd;
                System.out.println("CONTRASEÑA VÁLIDA");
            }
            else
                throw new Exception("CONTRASEÑA INVÁLIDA: "+pwd);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
