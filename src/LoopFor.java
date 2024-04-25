import java.util.Scanner;

public class LoopFor
{
    public static void main(String[] args)
    {
        Scanner leitura;
        double  nota;
        double  somaAvaliacoes;

        leitura = new Scanner(System.in);
        nota = 0;
        somaAvaliacoes = 0;        
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Sua nota de avaliação do filme: ");
            nota = leitura.nextDouble();
            somaAvaliacoes += nota;
        }
        leitura.close();
        System.out.printf("Média das avaliações: %.2f\n", somaAvaliacoes / 3);
    }
}
