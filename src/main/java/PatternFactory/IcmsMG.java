/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatternFactory;

import java.math.BigDecimal;
import modelo.Orcamento;

public class IcmsMG implements CalculoPorRegiao{
    
 @Override
 public BigDecimal calculoPorRegiao(Orcamento orcamento) {
     
    return orcamento.valorOrcamento.multiply(new BigDecimal("0.18"));
 }
}