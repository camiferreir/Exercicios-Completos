
package emprestimo.de.livros;

public class EmprestimoDeLivros {

    public static void main(String[] args) {
       Livro livro = new Livro("Verity", "Colleen Hoover");
        System.out.println("Livro: " + livro.getTitulo() + ", Disponível: " + livro.isDisponivel());
        livro.emprestar();
        System.out.println("Após empréstimo: " + livro.isDisponivel());
        livro.devolver();
        System.out.println("Após devolução: " + livro.isDisponivel());
    }
}
    
