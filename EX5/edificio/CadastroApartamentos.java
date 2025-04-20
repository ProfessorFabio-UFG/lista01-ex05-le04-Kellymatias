package edificio;

import moradores.Morador;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroApartamentos {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Morador m1 = new Morador("Ana Silva",    "123.456.789-00", "61 99999-1111",
                                  sdf.parse("15/03/1990"), 'F', 1, 101, "A1B2C3");
        Morador m2 = new Morador("Bruno Costa",  "987.654.321-00", "61 98888-2222",
                                  sdf.parse("22/07/1985"), 'M', 1, 101, "D4E5F6");
        Morador m3 = new Morador("Carla Pereira","321.654.987-00", "61 97777-3333",
                                  sdf.parse("05/11/1992"), 'F', 2, 202, "G7H8I9");

        Apartamento apt101 = new Apartamento(101, 1,  45.0, "alugado");
        Apartamento apt202 = new Apartamento(202, 2,  60.5, "quitado");

        apt101.adicionarMorador(m1);
        apt101.adicionarMorador(m2);
        apt202.adicionarMorador(m3);

        System.out.println(apt101);
        System.out.println(apt202);
    }
}
