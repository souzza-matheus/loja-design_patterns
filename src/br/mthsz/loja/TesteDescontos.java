package br.mthsz.loja;

import br.mthsz.loja.desconto.CalculadoraDeDescontos;
import br.mthsz.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"),2);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("200"),6);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento2));

    }
}
