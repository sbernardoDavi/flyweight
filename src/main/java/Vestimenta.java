public class Vestimenta {
    private String tipo;
    private Marca marcaVestimenta;

    public Vestimenta(String tipo, Marca marcaVestimenta) {
        this.tipo = tipo;
        this.marcaVestimenta = marcaVestimenta;
    }

    public String obterVestimenta(){
        return "Vestimenta{" +
                "tipo='" + this.tipo + '\'' +
                ", marca='" + marcaVestimenta.getNome() + '\'' +
                ", tamanho='" + marcaVestimenta.getTamanho() + '\'' +
                '}';


    }
}
