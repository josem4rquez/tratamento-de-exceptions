public class DivisãoNaoExataException extends Exception{
    
    private int numerador;
    private int denominador;
    
    public DivisãoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

}
