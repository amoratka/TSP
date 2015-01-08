/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import static tsp.Dijkstra.computePaths;
import static tsp.Dijkstra.getShortestPathTo;

/**
 *
 * @author Kamila
 */
public class FileReading {

    /**
     *
     * @param towns
     * @param miasta
     * @throws IOException
     */
    public static void townsReading(List<Town> towns, String miasta) throws IOException {
        FileReader fr = null;
        String line = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(miasta);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        line = bfr.readLine();
        try {
            while ((line = bfr.readLine()) != null) {
                Town town = new Town();
                town.id = Integer.parseInt(line.substring(0, 1));
                town.name = line.substring(2);
                towns.add(town);
                //System.out.println(line);
                //System.out.println(town.name+" "+town.id+" "+towns.size());
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        // ZAMYKANIE PLIKU
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }
    }

    public static void tasksReading(TasksList taskslist, String zlecenia) throws IOException {
        FileReader fr = null;
        String line = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(zlecenia);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        line = bfr.readLine();
        taskslist.from = Integer.parseInt(line.substring(0, 1));
        try {
            while ((line = bfr.readLine()) != null) {
                String[] table = line.split(" ");
                Task task = new Task();
                task.id = Integer.parseInt(table[0]);
                task.to = Integer.parseInt(table[2]);
                task.priority = Integer.parseInt(table[table.length - 1]);
                String name = line.substring(8);
                int tmp;
                tmp = table[table.length - 1].length() + 1;
                task.name = name.substring(0, name.length() - tmp);
                taskslist.tasks.offer(task);
                //System.out.println(line);
                //System.out.println(task.id+" "+task.to+" "+task.name+" "+task.priority);
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        // ZAMYKANIE PLIKU
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }
    }

    /**
     *
     * @param vertices
     * @param polaczenia
     * @param from
     * @throws java.io.IOException
     */
    public static void vertexReading(Vertex[] vertices, String polaczenia, int from) throws IOException {
        FileReader fr = null;
        String line = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(polaczenia);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        line = bfr.readLine();
        try {

            while ((line = bfr.readLine()) != null) {
                String[] table = line.split(" ");
                Edge edge = new Edge(vertices[Integer.parseInt(table[0])], Double.parseDouble(table[2]));
                Edge edge2 = new Edge(vertices[Integer.parseInt(table[1])], Double.parseDouble(table[2]));
                vertices[Integer.parseInt(table[0])].adjacencies.add(edge2);
                vertices[Integer.parseInt(table[1])].adjacencies.add(edge);

            }

        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        // ZAMYKANIE PLIKU
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }
    }
}
