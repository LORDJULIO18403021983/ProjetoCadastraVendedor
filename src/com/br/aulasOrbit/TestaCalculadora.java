package com.br.aulasOrbit;

public class TestaCalculadora {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operacao = '*';

        switch (operacao) {

            case '+':
                System.out.println("num1 + num2 = " + (num1 + num2));
                break;
            case '-':
                System.out.println("num1 - num2 = " + (num1 - num2));
                break;
            case '*':
                System.out.println("num1 * num2 = " + (num1 * num2));
                break;
            case '/':
                System.out.println("num1 / num2 = " + (num1 / num2));
                break;
            default:
                System.out.println("Operador invalido");
                break;
        }
    }
}
