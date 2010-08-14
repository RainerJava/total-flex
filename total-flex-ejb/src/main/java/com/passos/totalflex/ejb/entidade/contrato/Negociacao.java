/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.contrato;

import com.passos.totalflex.ejb.entidade.Produto;
import com.passos.totalflex.ejb.entidade.TabelaPreco;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *Permitir que cada produto possa ser negociado individualmente
 * @author clayton
 */
public class Negociacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal valorNegociado;

    @ManyToOne
    private Contrato contrato;

    private Produto produto;

    private TabelaPreco tabelaPreco;
}
