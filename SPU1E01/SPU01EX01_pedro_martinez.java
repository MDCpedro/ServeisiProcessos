package SPU1E01;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class SPU01EX01_pedro_martinez {
    public static void main(String[] args) throws IOException {
        if (args.length <= 0) {
            System.err.println("Se necesita un programa a ejecutar.");
            System.exit(-1);
        }
 
        ProcessBuilder pb = new ProcessBuilder(args);
        try {
            Process process = pb.start();
            int retorno = process.waitFor();
            InputStream is = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;

            System.out.println("La ejecución de " + Arrays.toString(args) + " retorna " + retorno);
        } catch (IOException ex) {
            System.err.println("Excepción de E/S.");
            System.exit(-1);
        } catch (InterruptedException ex) {
            System.err.println("El proceso hijo ha finalizado");
        }
    }
}
