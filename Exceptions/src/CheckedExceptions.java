import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedExceptions {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
            "Revise o nome do arquivo que você deseha imprimir: " + e.getCause());
            //e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
              "Ocorreu um erro inesperado!, Entre em contato com o Suporte! " + e.getCause());
              e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }
    
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}
