import java.util.Scanner;

public class Leitura
{
    public static void main(String[] args)
    {
        Scanner leitura;
        String  filme;
        int     anoDeLancamento;
        double  avaliacao;

        leitura = new Scanner(System.in);
        System.out.print("Seu filme favorito: ");
        filme = leitura.nextLine();
        System.out.print("Ano de lançamento: ");
        anoDeLancamento = leitura.nextInt();
        System.out.print("Sua nota de avaliação do filme: ");
        avaliacao = leitura.nextDouble();
        leitura.close();
        System.out.printf("Filme favorito: %s\n", filme);
        System.out.printf("Ano de lançamento: %d\n", anoDeLancamento);
        System.out.printf("Nota de avaliação: %.2f\n", avaliacao);
    }
}
