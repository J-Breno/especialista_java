import com.github.jbreno.banco.Conta;
import com.github.jbreno.banco.ContaEspecial;
import com.github.jbreno.banco.Titular;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("João", "123412341234");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 9,2134.3, 1234123.1234, 3241.21, 2341.22);
        Conta conta = (Conta) contaEspecial;
        System.out.println(conta.getAgencia());
    }
}