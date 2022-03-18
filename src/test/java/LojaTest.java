import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class LojaTest {

    @Test
    public void deveRetornarVestimentas(){
        
        Loja loja= new Loja();
        loja.cadastrar("Camiseta", "Adidas", "GG");
        loja.cadastrar("Casaco", "Nike", "GG");
        loja.cadastrar("Camisa", "Adidas", "GG");
        loja.cadastrar("Regata", "Adidas", "GG");

        List<String> saida = Arrays.asList(
                "Vestimenta{tipo='Camiseta', marca='Adidas', tamanho='GG'}",
                "Vestimenta{tipo='Casaco', marca='Nike', tamanho='GG'}",
                "Vestimenta{tipo='Camisa', marca='Adidas', tamanho='GG'}",
                "Vestimenta{tipo='Regata', marca='Adidas', tamanho='GG'}");

       assertEquals(saida, loja.obterVestimentas());

    }

    @Test
    public void deveRetornarTotalDeMarcas(){
        Loja loja= new Loja();
        loja.cadastrar("Camiseta", "Adidas", "GG");
        loja.cadastrar("Casaco", "Nike", "GG");
        loja.cadastrar("Camisa", "Adidas", "GG");
        loja.cadastrar("Regata", "Adidas", "GG");

        assertEquals(2, MarcaFactory.getMarcas());

    }

}