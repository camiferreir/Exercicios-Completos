package equipamentos.esportivos;

class Bola extends equipamento {

    private String material;

    public Bola(String nome, double precoAluguel, String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int definirDurabilidade() {
        return 20;
    }

    String getNome() {
        return null;
        
    }
}
