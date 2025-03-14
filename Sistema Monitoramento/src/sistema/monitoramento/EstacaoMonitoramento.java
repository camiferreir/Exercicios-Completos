package sistema.monitoramento;

import java.util.ArrayList;
import sistema.monitoramento.sensor.Sensor;

class EstacaoMonitoramento {

    private final ArrayList<Sensor> sensores;

    public EstacaoMonitoramento() {
        this.sensores = new ArrayList<>();
    }

    public void adicionarSensor(Sensor s) {
        sensores.add(s);
    }

    public void verificarEstado() {
        sensores.forEach((s) -> {
            if (s.isAtivo()) {
                System.out.println("Sensor em " + s.getLocalizacao() + " coletou: " + s.coletarDado());
            } else {
                System.out.println("Sensor em " + s.getLocalizacao() + " está inativo.");
            }
        });
    }

    void adicionarSensor(SensorTemperatura sensorTemp) {

    }

    void adicionarSensor(SensorUmidade sensorUmi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
