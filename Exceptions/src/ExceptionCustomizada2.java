import javax.swing.JOptionPane;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i ++) {

            try {
                if(numerador[1] %2 != 0) 
                throw new DivisãoNaoExataException("Divisão não exata", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado); 
            } catch (DivisãoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Erro, tentativa de divisão por 0 " + i);
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Erro, algum dos arrays está maior que o índice de outro array " + i);
                e.printStackTrace(); 
            }
               
        }
            System.out.println("O programa continua...");
    }
}


