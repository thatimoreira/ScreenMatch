import java.util.Scanner;

public class LoopWhile
{
    public static void main(String[] args)
    {
        Scanner leitura;
        double  nota;
        double  somaAvaliacoes;
        int     totalNotas;

        leitura = new Scanner(System.in);
        nota = 0;
        somaAvaliacoes = 0;
        totalNotas = 0;
        while (nota != -1)
        {
            System.out.print("Sua nota de avaliação do filme: ");
            nota = leitura.nextDouble();
            if (nota != -1)
            {
                somaAvaliacoes += nota;
                totalNotas++;
            }
        }
        leitura.close();
        System.out.printf("Média das avaliações: %.2f\n", somaAvaliacoes / totalNotas);
    }
}
