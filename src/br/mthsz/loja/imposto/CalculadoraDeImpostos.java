package br.mthsz.loja.imposto;

import br.mthsz.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    //Classe não cresce infinitamente
    //Não será necessario expandir a classe se for neecessario calcular outro imposto
    //mais facil de manter e entender o ocódigo
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto ){
        return imposto.calcular(orcamento);
    }
}
