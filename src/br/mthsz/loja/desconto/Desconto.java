package br.mthsz.loja.desconto;

import br.mthsz.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    //Ultilizado o padrão de projeto Template Method para reaproveitar os códigos comuns entre as classes
    //O método calcular faz parte do processo, mas outras partes ele delega para as classes filhas
    //Evita ter código duplicado
    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }else{
            return proximo.calcular(orcamento);
        }
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);



}
