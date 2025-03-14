package projetos.criativos;

public class ProjetosCriativos {

    public static void main(String[] args) {
        Filme filme = new Filme("Filme Romance", "10/03/2025", 50000.0, 120);
        Musica musica = new Musica("Melodia romantica", "11/03/2025", 5000.0, 200);

        System.out.println("Projeto: " + filme.getTitulo());
        System.out.println("Prazo estimado: " + filme.calcularPrazo() + " dias");

        System.out.println("\nProjeto: " + musica.getTitulo());
        System.out.println("Prazo estimado: " + musica.calcularPrazo() + " dias");
    }
}
