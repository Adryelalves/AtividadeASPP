package PatterFactory;

public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {
        if (nomeEstado.equalsIgnoreCase("ICMS_PR")) {
            return new IcmsPR();
        }else if (nomeEstado.equalsIgnoreCase("ICMS_RJ")){
            return new IcmsRJ();
        }else if(nomeEstado.equalsIgnoreCase("ICMS_SC")){
            return new IcmsSC();
        }else{
            System.out.println("Valor Invalido - ICMS nao cadastrado");
            return null;
        }
    }
}