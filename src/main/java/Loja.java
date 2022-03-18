import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Vestimenta> vestimentas = new ArrayList<>();

    public void cadastrar(String tipoVestimenta, String nomeMarca, String tamanho){
        Marca marca = MarcaFactory.getMarca(nomeMarca, tamanho);
        Vestimenta vestimenta = new Vestimenta(tipoVestimenta, marca);
        vestimentas.add(vestimenta);
    }

    public  List<String> obterVestimentas(){
        List<String> out = new ArrayList<String>();
        for(Vestimenta vestimenta : this.vestimentas){
            out.add(vestimenta.obterVestimenta());
        }
        return out;
    }
}
