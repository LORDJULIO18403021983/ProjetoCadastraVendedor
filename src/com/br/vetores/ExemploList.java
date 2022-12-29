package com.br.vetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // primeiro criamos o arryList.
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Elemento nº 1");
        arrayList.add("Elemento nº 2");
        arrayList.add("Elemento nº 3");

        System.out.println("Posição 1 contém" + arrayList.get(0));
        System.out.println("Posição 2 contém" + arrayList.get(1));
        System.out.println("Posição 3 contém" + arrayList.get(2));
        System.out.println("\n ===============");
        for (String s : arrayList) {
            System.out.println(s);
        }
        // tambem podemos adicionar um elemento a uma posição qualquer
        arrayList.add(1, "Elemento nº 1, 5: \n");
        for (String s : arrayList) {
            System.out.println(s);
        }
        // obtendo o tamanho da lista chamando o metodo size()
        System.out.println("\nO tamanho da lista é:" + arrayList.size() + "\n");
        // podemos ver se existe algum valor na lista
        if (arrayList.contains("Elemento nº 1, 5:"))
            System.out.println("Elemento nº 1, 5: está lá");
        else
            System.out.println("Elemento nº 1, 5: não está lá");

        if (arrayList.contains("Elemento nº 2, 5:"))
            System.out.println("Elemento nº 2, 5: está lá");
        else
            System.out.println("Elemento nº 2, 5: não está lá");

        //podemos descobrirqual o indice do elemento
        int indice = arrayList.indexOf("Elemento nº 1, 5:");
        System.out.println("\nO indice do elemento nº 1, 5' é:" + indice);
        // remove um elemneto da lista com remove
        System.out.println("Removendo o elemento nº 1, 5 ");
        arrayList.remove("Elemento nº 1, 5:");
        System.out.println("Lista atualizaada!");
        for (String s : arrayList) {
            System.out.println(s);
        }
        // remove tambem um item da lista
        System.out.println("\nRemovendo o ultimo elemento da lista");
        arrayList.remove(arrayList.size() - 1);
        System.out.println("\nLista atualizada");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("\nAdicionando mais elemnetos a lista");
        arrayList.add("Elemnto 5");
        arrayList.add("Elemnto 9");
        arrayList.add("Elemnto 4");
        arrayList.add("Elemnto 0");
        arrayList.add("Elemnto 8");
        System.out.println("Mostrando a nova lista");
        for (String s : arrayList) {
            System.out.println(s);
        }
        // podemos ordenar a lista,desde que a classe dentron dela seja compareble
        Collections.sort(arrayList);
        System.out.println("\nLista ordenada");
        for (String s : arrayList) {
            System.out.println(s);
        }
        List<String> arrayListNovo = new ArrayList<String>(arrayList);
        System.out.println("\nAdicionando o elemento nº 11 a nova lista");
        arrayList.add("Elemento nº 11");

        // verificando a diferença das duas listas
        for (String s: arrayList) {
            System.out.println("\nLista arrayList apos adiconar um novo elemento.");
            System.out.println(s);
        }
        System.out.println("\nLista arrayListaNovo");
        for(String s: arrayListNovo){
            System.out.println(s);
        }
    }
}
