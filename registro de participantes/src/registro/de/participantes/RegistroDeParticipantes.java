package registro.de.participantes;

public class RegistroDeParticipantes {

    public static void main(String[] args) {

        Participante p1 = new Participante("Camille Brito");
        p1.setEmail("Camille@gmail.com");

        Participante p2 = new Participante("Rafaela Cardoso", "Rafa@email.com", "12/03/2025");

        System.out.println("Participante 1:");
        System.out.println("Nome: " + p1.getNomeCompleto());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("Data de Inscrição: " + p1.getDataInscricao());

        System.out.println("\nParticipante 2:");
        System.out.println("Nome: " + p2.getNomeCompleto());
        System.out.println("Email: " + p2.getEmail());
        System.out.println("Data de Inscrição: " + p2.getDataInscricao());
    }
}
