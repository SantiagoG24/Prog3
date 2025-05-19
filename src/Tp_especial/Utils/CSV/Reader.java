package Tp_especial.Utils.CSV;


import Tp_especial.Maquina;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
public class Reader {
    private ArrayList<Maquina> maquinas;

    public void readTasks(String taskPath) {

        // Obtengo una lista con las lineas del archivo
        // lines.get(0) tiene la primer linea del archivo
        // lines.get(1) tiene la segunda linea del archivo... y así
        ArrayList<String[]> lines = this.readContent(taskPath); //O(N) n = elementos archivo
        for (String[] line: lines) { //O(N) n = elementos Maquina
            // Cada linea es un arreglo de Strings, donde cada posicion guarda un elemento
            String id = line[0].trim();
            String valor = line[1].trim();
            // Aca instanciar lo que necesiten en base a los datos leidos
            //Maquina maquina = new Maquina(id, valor);

        }
    }

    private ArrayList<String[]> readContent(String path) {
        ArrayList<String[]> lines = new ArrayList<String[]>();

        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                lines.add(line.split(","));
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
        }

        return lines;
    }
}
