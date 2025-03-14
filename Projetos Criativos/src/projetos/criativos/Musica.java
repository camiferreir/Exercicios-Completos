package projetos.criativos;

class Musica extends Projeto {

    private int numeroNotas;

    public Musica(String titulo, String dataInicio, double orcamento, int numeroNotas) {
        super(titulo, dataInicio, orcamento);
        this.numeroNotas = numeroNotas;
    }

    public int getNumeroNotas() {
        return numeroNotas;
    }

    public void setNumeroNotas(int numeroNotas) {
        this.numeroNotas = numeroNotas;
    }

    @Override
    public int calcularPrazo() {
        return numeroNotas / 50;
    }
}
