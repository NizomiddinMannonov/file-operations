package uz.pdp.exampleEnum;

public class KunXato extends RuntimeException {
    public KunXato(String message) {
        super(message);
    }

    public KunXato(String message, Throwable cause) {
        super(message, cause);
    }
}
