package cic.es.Ejerc007.Exceptions;

public class VentaException extends RuntimeException{
    
    public VentaException(String message){
        super(message);
    }

    public VentaException(String message,Throwable cause){
        super(message, cause);
    }

}
