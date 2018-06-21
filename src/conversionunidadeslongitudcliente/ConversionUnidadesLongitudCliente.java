package conversionunidadeslongitudcliente;

public class ConversionUnidadesLongitudCliente {

    public static void main(String[] args) {
        System.out.println("Resultado: " + centimetrosAPulgadas(2.54));
        System.out.println("Resultado: " + pulgadasACentimetros(1.0));
    }

    private static Double pulgadasACentimetros(java.lang.Double pulgadas) {
        ws.ConversionUnidadesLongitudWS_Service service = new ws.ConversionUnidadesLongitudWS_Service();
        ws.ConversionUnidadesLongitudWS port = service.getConversionUnidadesLongitudWSPort();
        return port.pulgadasACentimetros(pulgadas);
    }

    private static Double centimetrosAPulgadas(java.lang.Double centimetros) {
        ws.ConversionUnidadesLongitudWS_Service service = new ws.ConversionUnidadesLongitudWS_Service();
        ws.ConversionUnidadesLongitudWS port = service.getConversionUnidadesLongitudWSPort();
        return port.centimetrosAPulgadas(centimetros);
    }
    
}
