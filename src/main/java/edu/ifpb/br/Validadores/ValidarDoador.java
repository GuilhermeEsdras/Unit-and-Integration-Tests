package edu.ifpb.br.Validadores;

import edu.ifpb.br.Classes.Doador;

public class ValidarDoador {

    private Boolean validarIdade(int idade, Boolean doador){
        if(idade >= 16 && idade <= 69){
            return idade <= 60 || doador;
        }
        return false;

    }

    private Boolean validarPeso(double peso, char sexo){
        return ((sexo == 'M' && peso >= 60) || (sexo == 'F' && peso >= 50));
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


//  Existem alguns requisitos de quem não pode doar sangue:
//- Estiver com febre no dia da doação;
//- Estiver grávida;
//- Estiver amamentando, a menos que o parto tenha ocorrido há mais de 12 meses.

    public Boolean validarSegundaParte(Doador doador){
        if(!doador.isFebre()){
            if(!doador.isGravida()){
                if(!(doador.isAmamentando() && doador.isParto())){
                    System.out.println("Por favor, aguarde na fila para doação");
                    return true;
                }else{
                    System.out.println("Não pode doar, pois a doadora está amamentando!");
                    return false;
                }
            }else System.out.println("Não pode doar, pois a doadora está gravida");
        }else System.out.println("Doador está com febre!");

        return false;
    }






}
