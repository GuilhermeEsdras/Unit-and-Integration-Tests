package edu.ifpb.br.Validadores;

import edu.ifpb.br.Classes.Doador;

public class ValidarDoador {

    private Boolean validarIdade(int idade, Boolean doador){
        return ((idade >= 16 && idade <= 69) || (idade > 60 && doador));
    }

    private Boolean validarPeso(double peso, char sexo){
        return ((sexo == 'M' && peso > 60) || (sexo == 'F' && peso > 50));
    }

    public Boolean validarPrimeiraParte(Doador doador){

        if (validarIdade(doador.getIdade(), doador.isDoador()) ){
            if(validarPeso(doador.getPeso(), doador.getSexo())){
                System.out.println("Você está apto(a) para a Etapa 2");
                return true;
            }else System.out.println("Você não tem o peso minimo para doar!");
        }else System.out.println("Não é possivel doar sangue! \nSua idade não permite doar sangue");

        return false;
    }






}
