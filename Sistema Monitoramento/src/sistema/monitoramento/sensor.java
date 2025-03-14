package sistema.monitoramento;

public abstract class sensor {

    private int nivelBateria;
    private boolean ativo;

    abstract class Sensor {

        private final String localizacao;
        private final int nivelBateria;
        private final boolean ativo;

        public Sensor(String localizacao) {
            this.localizacao = localizacao;
            this.nivelBateria = 100;
            this.ativo = true;
        }

        public String getLocalizacao() {
            return localizacao;
        }

        public int getNivelBateria() {
            return nivelBateria;
        }

        public boolean isAtivo() {
            return ativo;
        }

        String coletarDado() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria < 0) {
            this.nivelBateria = 0;
        } else if (nivelBateria > 100) {
            this.nivelBateria = 100;
        } else {
            this.nivelBateria = nivelBateria;
        }

        if (this.nivelBateria == 0) {
            this.ativo = false;
        }

    }
      public abstract double coletarDado();
}

