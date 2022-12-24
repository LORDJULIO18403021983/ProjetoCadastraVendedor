package com.br.aulasOrbit;

public class TestaCarro {
    public static void main(String[] args) {
        String modeloDoCarro1 = "Corolla";
        String modeloDoCarro2 = "Chevette";
        String modeloDoCarro3 = "Hrv";
        String modeloDoCarro4 = "Corolla Cross";

        int velocidadeMinima1 = 10;
        int velocidadeMinima2 = 10;
        int velocidadeMinima3 = 10;
        int velocidadeMinima4 = 10;

        int velocidadeMaxima1 = 220;
        int velocidadeMaxima2 = 210;
        int velocidadeMaxima3 = 240;
        int velocidadeMaxima4 = 270;

        int anoFabricacao1 = 2022;
        int anoFabricacao2 = 2021;
        int anoFabricacao3 = 2020;
        int anoFabricacao4 = 2020;

        int anoModelo1 = 2022;
        int anoModelo2 = 2021;
        int anoModelo3 = 2020;
        int anoModelo4 = 2020;

        char combustivel1 = 'G';
        char combustivel2 = 'G';
        char combustivel3 = 'G';
        char combustivel4 = 'G';

        char combustivelBuscar1 = 'G';
        char combustivelBuscar2 = 'G';
        char combustivelBuscar3 = 'G';
        char combustivelBuscar4 = 'G';
        int velicidadeMinimaBuscar = 10;

        boolean carroDisponivel = true;
        boolean carroVenda1 = true;
        boolean carroVenda2 = false;
        boolean carroVenda3 = true;
        boolean carroVenda4 = false;

        if ((combustivelBuscar1 == combustivel1 && carroDisponivel == true) && (velocidadeMinima1 <= velicidadeMinimaBuscar)) {
            System.out.println("\nO combustivel informado:" + combustivel1 + "\nModelo do Carro : " + modeloDoCarro1 + "\n Velocidade Minima:" + velocidadeMinima1 + "\n Velocidade Maxima:" + velocidadeMaxima1 + "\nAno de fabricação: " + anoFabricacao1 + "\nAno do Modelo: " + anoModelo1);
            if (carroVenda1 == true) {
                System.out.println("O carro está à venda!");
            } else
                System.out.println("O carro não está à venda!");
        }
        if ((combustivelBuscar2 == combustivel2 && carroDisponivel == true) && (velocidadeMinima2 <= velicidadeMinimaBuscar)) {
            System.out.println("\nO combustivel informado:" + combustivel2 + "\nModelo do Carro : " + modeloDoCarro2 + "\n Velocidade Minima:" + velocidadeMinima2 + "\n Velocidade Maxima:" + velocidadeMaxima2 + "\nAno de fabricação: " + anoFabricacao2 + "\nAno do Modelo: " + anoModelo2);
            if (carroVenda2 == true) {
                System.out.println("O carro está à venda!");
            } else
                System.out.println("O carro não está à venda!");
        }
        if ((combustivelBuscar3 == combustivel3 && carroDisponivel == true) && (velocidadeMinima3 <= velicidadeMinimaBuscar)) {
            System.out.println("\nO combustivel informado:" + combustivel3 + "\nModelo do Carro : " + modeloDoCarro3 + "\n Velocidade Minima:" + velocidadeMinima3 + "\n Velocidade Maxima:" + velocidadeMaxima3 + "\nAno de fabricação: " + anoFabricacao3 + "\nAno do Modelo: " + anoModelo3);
            if (carroVenda3 == true) {
                System.out.println("O carro está à venda!");
            } else
                System.out.println("O carro não está à venda!");
        }
        if ((combustivelBuscar4 == combustivel4 && carroDisponivel == true) && (velocidadeMinima4 <= velicidadeMinimaBuscar)) {
            System.out.println("\nO combustivel informado:" + combustivel4 + "\nModelo do Carro : " + modeloDoCarro4 + "\n Velocidade Minima:" + velocidadeMinima4 + "\n Velocidade Maxima:" + velocidadeMaxima4 + "\nAno de fabricação: " + anoFabricacao4 + "\nAno do Modelo: " + anoModelo4);
            if (carroVenda4 == true) {
                System.out.println("O carro está à venda!");
            } else
                System.out.println("O carro não está à venda!");
        }

    }
}
