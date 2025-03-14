package registro.de.participantes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Participante {

    private String nomeCompleto;
    private String email;
    private String dataInscricao;

    public Participante(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.dataInscricao = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Participante(String nomeCompleto, String email, String dataInscricao) {
        this.nomeCompleto = nomeCompleto;
        this.setEmail(email);
        this.dataInscricao = dataInscricao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido!");
        }
    }
}
