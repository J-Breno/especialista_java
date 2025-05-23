import com.github.jbreno.agencia.CadastroHotel;
import com.github.jbreno.agencia.Hotel;

public class Main {
    public static void main(String[] args) {
        CadastroHotel cadastroHotel = new CadastroHotel();
        Hotel hotel = new Hotel("Jaguaribe Lodge", "Fortim/CE", 1300);
        Hotel hotel1 = new Hotel("Jaguaribe Lodge", "Fortim/CE", 1300);
        Hotel hotel2 = new Hotel("Vila Lodge", "Fortim/CE", 1300);

        cadastroHotel.adicionarHotel(hotel);
        cadastroHotel.adicionarHotel(hotel1);
        cadastroHotel.adicionarHotel(hotel2);

    }
}