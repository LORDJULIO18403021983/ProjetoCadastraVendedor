package com.br.aulasOrbit;

public class PetShop {
    public static void main(String[] args) {
        // Declaração das variavéis
        String nome1 = "Storm", nome2 = "Lilica", nome3 = "Peninha";
        String raca1 = "Fila Brasileiro", raca2 = "Siamês", raca3 = "Papaguaio-do-mangue";
        String tipo1 = "Cão", tipo2 = "Gato", tipo3 = "Pássaro";
        String problema = "Vômito";
        int idade = 3, anoAtual = 2022, anoVacinacao = 2020, durConsultaMin = 60;
        int vacinacao = anoAtual - anoVacinacao;
        double valHoraConsulta = 20.5, valPago = 20.5;

        // Condição 'se':
        if (vacinacao <= 3 && valPago == valHoraConsulta && durConsultaMin == 60) {
            System.out.println("\n Nome do animal:" + nome1 + "       " + "Idade: " + idade + "      " + "Problema:" + problema
                    + "      " + "Tipo do animal: " + tipo1
                    + "      " + "Raça: " + raca1 + "      " + " Ano da vacinação:" + anoVacinacao);
            System.out.println("\n Nome do animal:" + nome2 + "       " + "Idade: " + idade + "      " + "Problema:" + problema
                    + "      " + "Tipo do animal: " + tipo2
                    + "      " + "Raça: " + raca2 + "      " + " Ano da vacinação:" + anoVacinacao);
            System.out.println("\n Nome do animal:" + nome3 + "       " + "Idade: " + idade + "      " + "Problema:" + problema
                    + "      " + "Tipo do animal: " + tipo3
                    + "      " + "Raça: " + raca3 + "      " + " Ano da vacinação:" + anoVacinacao);

            System.out.println("\n NÃO NECESSITA DE VACINAÇÃO!");

        } else if (vacinacao > 3 && valPago == valHoraConsulta && durConsultaMin == 60) {
            System.out.println("\n Nome do animal:" + nome1 + "       " + "Idade: " + idade + "      " + "Problema:" + problema
                    + "      " + "Tipo do animal: " + tipo1
                    + "      " + "Raça: " + raca1 + "      " + " Ano da vacinação:" + anoVacinacao);
            System.out.println("\n Nome do animal:" + nome2 + "       " + "Idade: " + idade + "      " + "Problema:" + problema
                    + "      " + "Tipo do animal: " + tipo2
                    + "      " + "Raça: " + raca2 + "      " + " Ano da vacinação:" + anoVacinacao);
            System.out.println("\n Nome do animal:" + nome3 + "       " + "Idade: " + idade + "      " + "Problema:" + problema
                    + "      " + "Tipo do animal: " + tipo3
                    + "      " + "Raça: " + raca3 + "      " + " Ano da vacinação:" + anoVacinacao);

            System.out.println("\n NECESSITA DE VACINAÇÃO!");
        }
    }
}
