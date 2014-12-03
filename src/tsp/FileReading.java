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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kamila
 */
public class FileReading {

    /**
     *
     * @param towns
     * @throws IOException
     */
    public static void TownsReading(List towns) throws IOException {
        FileReader fr = null;
        String line = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader("miasta.txt");
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        line=bfr.readLine();
        try {
            while ((line = bfr.readLine()) != null) {
                Town town = new Town();
                town.id = Integer.parseInt(line.substring(0,1));
                town.name=line.substring(2);
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
    public static void TasksReading(TasksList taskslist) throws IOException{
        FileReader fr = null;
        String line = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader("zlecenia.txt");
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        line=bfr.readLine();
        taskslist.from=Integer.parseInt(line.substring(0,1));
        try {
            while ((line = bfr.readLine()) != null) {
                String[] table=line.split(" ");
                Task task=new Task();
                task.id=Integer.parseInt(table[0]);
                task.to=Integer.parseInt(table[2]);
                task.priority=Integer.parseInt(table[table.length-1]);
                String name=line.substring(8);
                int tmp;
                tmp=table[table.length-1].length()+1;
                task.name=name.substring(0,name.length()-tmp);
                taskslist.tasks.add(task);
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
        
    public static void DistancesReading(List distances) throws IOException{
        FileReader fr = null;
        String line = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader("połączenia.txt");
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        line=bfr.readLine();
        try {
            while ((line = bfr.readLine()) != null) {
                String[] table=line.split(" ");
                Distance distance = new Distance();
                distance.from=Integer.parseInt(table[0]);
                distance.to=Integer.parseInt(table[1]);
                distance.distance=Integer.parseInt(table[2]);
                distances.add(distance);
                //System.out.println(line);
                //System.out.println(distance.from+" "+distance.to+" "+distance.distance);
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
