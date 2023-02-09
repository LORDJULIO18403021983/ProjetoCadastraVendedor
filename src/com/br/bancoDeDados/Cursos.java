package com.br.bancoDeDados;

public enum Cursos {
    JAVA(180," Noturno "),
    COBOL(160," Vespertino "),
    PHP(40," Noturno/Matutino "),
    UNITY(100," Noturno/Vespertino ");

    private int horas;
    private String periodo;

    Cursos(int horas, String periodo) {
        this.horas = horas;
        this.periodo = periodo;
    }
    private int getHoras(){
        return horas;
    }
    private String getPeriodo(){
        return periodo;
    }

    public static void main(String[] args) {
        System.out.println("Cursos de "+ Cursos.COBOL+ " -" +Cursos.COBOL.getPeriodo()+ "dura��o de "+ Cursos.COBOL.getHoras()+" horas");
        System.out.println("Cursos de "+ Cursos.JAVA+ " -" +Cursos.JAVA.getPeriodo()+ " dura��o de "+ Cursos.JAVA.getHoras()+" horas");
        System.out.println("Cursos de "+ Cursos.PHP+ " -" +Cursos.PHP.getPeriodo()+ " dura��o de "+ Cursos.PHP.getHoras()+" horas");
        System.out.println("Cursos de "+ Cursos.UNITY+ " -" +Cursos.UNITY.getPeriodo()+ "dura��o de "+ Cursos.UNITY.getHoras()+" horas");
    }
}
