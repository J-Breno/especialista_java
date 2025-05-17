public class PricipalVisitante {
    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.nome = "João";
        visitante.idade = 20;

        if(visitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não permitido para menores de %d anos", Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }
    }
}
