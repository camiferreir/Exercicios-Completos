
package equipamentos.esportivos;


public class EquipamentosEsportivos {

    
    public static void main(String[] args) {
    Bicicleta bicicleta = new Bicicleta("Bicicleta Montanha", 25.0, "Montanha");
        Bola bola = new Bola("Bola de Futebol", 10.0, "Couro");
        
        System.out.println("Equipamento: " + bicicleta.getNome());
        System.out.println("Tipo: " + bicicleta.getTipo());
        System.out.println("Durabilidade: " + bicicleta.definirDurabilidade() + " horas");
        
        System.out.println("\nEquipamento: " + bola.getNome());
        System.out.println("Material: " + bola.getMaterial());
        System.out.println("Durabilidade: " + bola.definirDurabilidade() + " horas");
    }
}

   