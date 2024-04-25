public class Main {
    public static void main(String[] args) {
        int     anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double  notaDoFilme = 8.1;
        double  mediaAvaliacoes = (9.8 + 6.3 + 8.2) / 3;
        int     classificacao;
        classificacao = (int) mediaAvaliacoes / 2;
        String  sinopse;
        sinopse = """
                Filme: Top Gun: Maverick
                Sinopse: Filme de aventura com galã dos anos 80.
                Ano de lançamento: %d
                Média das avaliações: %.2f
                """.formatted(anoDeLancamento, mediaAvaliacoes);
        System.out.println("Esse é o Screen Match");
        System.out.printf(sinopse);
        System.out.printf("Classificação: %d", classificacao);
    }
}