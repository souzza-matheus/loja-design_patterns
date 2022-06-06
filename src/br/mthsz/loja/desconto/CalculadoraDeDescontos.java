package br.mthsz.loja.desconto;

import br.mthsz.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    //strategy não é indicado já que não é possivel retirar a verificação de qual desconto é aplicavel
    /*Se um tipo de desconto não for aplicavel ele chama o próximo já que existe um elo de ligação entre eles,
    até achar um desconto aplicavel e retornar o valor do desconto. Se não encontrar nenhum desconto aplicavel
     chega na classe SemDesconto que não está ligada a outra classe de desconto encerrando esse ciclo e retornando o valor 0*/
    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
