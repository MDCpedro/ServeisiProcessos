package SPU1EX02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class ProcesoPadre {
    public static void main(String[] args) {
        String[] argumentos = {"java", "ProcesoHijo.java"};
        ProcessBuilder processBuilder = new ProcessBuilder(argumentos);
        Process proceso = processBuilder.start();
        Writer processWriter = new OutputStreamWriter(proceso.getOutputStream());
        InputStream inputStream = proceso.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Scanner scanner = new Scanner(System.in);
    }
}
