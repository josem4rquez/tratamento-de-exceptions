public class DivisãoNaoExataException extends Exception{
    
    @SuppressWarnings("unused")
    private int numerador;
    @SuppressWarnings("unused")
    private int denominador;
    
    public DivisãoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

}
