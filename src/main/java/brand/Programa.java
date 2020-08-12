package main.java.brand;

public class Programa {
    public static void main(String[] args) {

        System.out.println("Iniciando programa...");

        for (int nome = 0; (nome <= 999); ++nome) {

            if (nome % 3 == 0 && nome % 5 == 0) {
                System.out.println(nome + "\tfizzbuzz");

            } else if (nome % 3 == 0) {
                System.out.println(nome + "\tfizz");

            } else if (nome % 5 == 0) {
                System.out.println(nome + "\tbuzz");

            }
        }
    }
}