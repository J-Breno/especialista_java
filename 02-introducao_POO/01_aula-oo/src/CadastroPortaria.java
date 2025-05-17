public class CadastroPortaria {
    void cadastrar(Visitante visitante, int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 20;
        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);
    }
}
