package edu.ifpb.br.App;

import edu.ifpb.br.Classes.Doador;
import edu.ifpb.br.Validadores.ValidarDoador;

import java.util.Scanner;


public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Doador doador = new Doador("Gui Esdras", 61 , 50.00, 'F', false, true, true, false, false);

        ValidarDoador validarDoador = new ValidarDoador();

         if(validarDoador.validarPrimeiraParte(doador)){
             validarDoador.validarSegundaParte(doador);
         }

    }
}

