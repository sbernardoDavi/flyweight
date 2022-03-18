import java.util.HashMap;
import java.util.Map;

public class MarcaFactory {

    private static Map<String, Marca> marcas = new HashMap<>();

    public static Marca getMarca(String nome, String tamanho){
        Marca marca = marcas.get(nome);
        if(marca == null){
            marca = new Marca(nome, tamanho);
            marcas.put(nome, marca);
        }
        return marca;
    }


    public static int getMarcas(){
        return  marcas.size();
    }

}
