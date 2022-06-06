package br.mthsz.loja;

import br.mthsz.loja.imposto.CalculadoraDeImpostos;
import br.mthsz.loja.imposto.TipoImposto;
import br.mthsz.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        calculadora.calcular(orcamento, TipoImposto.ICMS);

    }
}
