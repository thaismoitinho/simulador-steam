import java.util.Scanner;

public class Steam {
    public static void main(String[] args) {
    Jogo compra1 = new Jogo("Resident Evil", "Sobrevivencia", 50.0, 1996,4);
    Jogo compra2 = new Jogo("GTA San Andreas", "Ação", 45.0, 2004, 2);
    Jogo compra3 = new Jogo("Homem Aranha 2", "Aventura", 60.0,2023, 5);

        Scanner leitor = new Scanner(System.in);

        System.out.println(compra1);
        System.out.println(compra2);
        System.out.println(compra3);

        leitor.nextLine();

        compra1.RetornarNomeJogo();
        compra1.RetornarIdadeJogo();
        compra1.RetornarValorTotal();
        leitor.nextLine();

        compra2.RetornarNomeJogo();
        compra2.RetornarIdadeJogo();
        compra2.RetornarValorTotal();
        leitor.nextLine();

        compra3.RetornarNomeJogo();
        compra3.RetornarIdadeJogo();
        compra3.RetornarValorTotal();
        leitor.nextLine();
    }

}
