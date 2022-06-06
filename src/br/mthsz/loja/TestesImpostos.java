package br.mthsz.loja;

import br.mthsz.loja.imposto.CalculadoraDeImpostos;
import br.mthsz.loja.imposto.ICMS;
import br.mthsz.loja.imposto.ISS;
import br.mthsz.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"),5);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
        System.out.println(calculadora.calcular(orcamento, new ISS()));

    }
}
