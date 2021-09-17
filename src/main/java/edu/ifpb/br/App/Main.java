package edu.ifpb.br.App;

import edu.ifpb.br.Classes.Doador;
import edu.ifpb.br.Validadores.ValidarDoador;

import java.util.Locale;
import java.util.Scanner;


public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        boolean resp;

        Doador doador = new Doador();
        ValidarDoador validarDoador = new ValidarDoador();

        System.out.println("| ETAPA 1 |");

        digite("o seu nome");
        String nome = sc.nextLine();
        doador.setNome(nome);

        digite("o seu sexo [F/M]");
        char sexo = sc.next().toUpperCase(Locale.ROOT).charAt(0);
        doador.setSexo(sexo);

        digite("a sua idade");
        int idade = sc.nextInt();
        doador.setIdade(idade);

        digite("o seu peso");
        double peso = sc.nextDouble();
        doador.setPeso(peso);

        pergunta("Já doou sangue alguma vez?");
        resp = getResposta();
        doador.setDoador(resp);

         if(validarDoador.validarPrimeiraParte(doador)){
             System.out.println("| ETAPA 2 |");

             pergunta("Esta com febre?");
             resp = getResposta();
             doador.setFebre(resp);

             pergunta("Esta gravida?");
             resp = getResposta();
             doador.setGravida(resp);

             pergunta("Esta amamentando?");
             resp = getResposta();
             doador.setAmamentando(resp);

             if (doador.isAmamentando()) {
                 pergunta("Ha quantos meses ocorreu o parto?");
                 int meses = sc.nextInt();
                 doador.setParto(meses < 12);
             }

             validarDoador.validarSegundaParte(doador);
         }
    }

    public static boolean getResposta() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char resp = sc.next().toUpperCase(Locale.ROOT).charAt(0);
            if (resp == 'S') return true;
            else if (resp == 'N') return false;
            else {
                System.out.print("Digite uma resposta valida! (S / N): ");
            }
        }
    }

    public static void pergunta(String msg) {
        System.out.print("> " + msg + " [S/n]: ");
    }

    public static void digite(String msg) {
        System.out.print("> Digite " + msg + ": ");
    }
}

