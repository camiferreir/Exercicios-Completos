package sistema.monitoramento;

class SensorTemperatura extends sensor {

    private final String unidade;

    public SensorTemperatura(String localizacao, String unidade) {
       
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    @Override
    public double coletarDado() {
        return 25.5;
    }
}
