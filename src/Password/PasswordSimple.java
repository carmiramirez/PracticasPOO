package Password;

public class PasswordSimple extends Password{
    public PasswordSimple(){
        // la contraseña debe tener entre 5 y 8 caracteres incluyendo letras y numeros
        super("[a-zA-Z0-9]{5,8}");
    }
}
