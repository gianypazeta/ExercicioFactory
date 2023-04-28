
package PatternFactory;

import java.math.BigDecimal;
import modelo.Orcamento;

public class IcmsSP implements CalculoPorRegiao{

 public BigDecimal calculoPorRegiao(Orcamento orcamento) {
     
    return orcamento.valorOrcamento.multiply(new BigDecimal("0.12"));
 }
}