
package sistema.monitoramento;

public class SistemaMonitoramento {

    public static void main(String[] args) {
  EstacaoMonitoramento estacao = new EstacaoMonitoramento();
        
        SensorTemperatura sensorTemp = new SensorTemperatura("Sala 1", "Celsius");
        SensorUmidade sensorUmi = new SensorUmidade("Sala 2", 5);
        
        estacao.adicionarSensor(sensorTemp);
        estacao.adicionarSensor(sensorUmi);
        
        estacao.verificarEstado();
    }
}

