package com.Enums;

import static com.Enums.ExEnum.CREDITO;
import static com.Enums.ExEnum.DEBITO;
public class TipoMovimento {

    public void pegarTipoServico(ExEnum exenum){

        if(exenum.equals(CREDITO)){
            System.out.println("credito!");
        }

        if(exenum.equals(DEBITO)){
            System.out.println("debito!");
        }

    }

}
