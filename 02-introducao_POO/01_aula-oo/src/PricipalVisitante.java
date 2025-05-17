public class PricipalVisitante {
    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.nome = "João";
        visitante.idade = 20;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(visitante, 10);
    }
}
