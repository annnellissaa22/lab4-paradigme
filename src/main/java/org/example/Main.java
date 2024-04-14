package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FileInputStream fisier = null;
        List<String> list = new ArrayList<>();
        System.out.println("Se da o lista : ");

        try {

            fisier = new FileInputStream("src/text.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        Scanner scanner = new Scanner(fisier);
                while (scanner.hasNext()) {
            list.add(scanner.nextLine());
            System.out.println(list.get(list.size() - 1));
        }
        scanner.close();
        System.out.println("Cuvintele din lista apar de  : ");
        Collections.sort(list);


        Map<String, Integer> wordCount = new HashMap <String, Integer>();
        for(String line : list) {
            String[] words = line.split(" ");
            for (String word : words) {
                word = word.toLowerCase();
                if (!wordCount.containsKey(word)) {
                    wordCount.put(word, 1);
                } else {
                    wordCount.put(word, wordCount.get(word) + 1);
                }
            }
        }
            for(String word : wordCount.keySet())
            {
                System.out.println(word + " " + wordCount.get(word));
            }

        /*
       boolean ok = false;
        for (String sc : list) {
            System.out.println(list);
            if (sc.contains(" mere ") || sc.contains(" Mere ") || sc.contains(" MERE "))
           ok = true;
        }
        if (ok) System.out.println("Fisierul contine cuvantul mere.");
        else System.out.println("Fisierul nu contine cuvantul mere.");

        List<String> lista_cuvinte = new ArrayList<>();
        for(String line : lista_cuvinte)
        {
            String[] sir = line.split("+| |,| '|");
            lista_cuvinte.addAll(Arrays.asList(sir));
        }

        Collections.sort(lista_cuvinte);
        String un_cuvant = lista_cuvinte.get(0);
        int contor = 0;
        for(String cuvant : lista_cuvinte)
        {
            if(Objects.equals(cuvant, un_cuvant))
            {
                contor++;
            }
            else if(contor != 0)
            {(
                System.out.println(un_cuvant + " " + contor);
                un_cuvant = cuvant;
                contor = 1;
            }
        }

        List<String> lista_cuvinte = Arrays.asList(list.split(" "));
        */

    }
}