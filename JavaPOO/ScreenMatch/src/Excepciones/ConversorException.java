package Excepciones;

public class ConversorException extends RuntimeException {
    private String mensaje;
    
    public ConversorException(String s){
        this.mensaje = s;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
