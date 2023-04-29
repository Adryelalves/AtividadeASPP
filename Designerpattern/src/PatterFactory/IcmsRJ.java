package PatterFactory;

import java.math.BigDecimal;

public class IcmsRJ implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(modelo.Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal("0.17"));
    }
}
