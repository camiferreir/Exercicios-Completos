package sistema.monitoramento;

class SensorUmidade extends sensor {

    private final int precisao;

    public SensorUmidade(String localizacao, int precisao) {

        this.precisao = precisao;
    }

    public int getPrecisao() {
        return precisao;
    }

    @Override
    public double coletarDado() {
        return 60.0;
    }
}
