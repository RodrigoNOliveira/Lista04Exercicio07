import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    int amanteDeArtesVisuais = 0;
    int estudante = 0;
    int praticasSaudaveis = 0;
    int gamer = 0;
    int amanteDeMusicas = 0;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Quiz atividades diarias");
    System.out.println();
    System.out.println("Responda as seguintes perguntas (use 1 para SIM e 2 para NÃO)");
    System.out.println();

    System.out.print("1-Você assiste séries? ");
    int Series = input.nextInt();
    
    if (Series == 1){
        amanteDeArtesVisuais = amanteDeArtesVisuais + 1;
    }

    System.out.println();
    System.out.print("2-Você estuda diariamente? ");
    int estudo = input.nextInt();
    if (estudo == 1){
        estudante = estudante + 1;
    }

    System.out.println();
    System.out.print("3- Você pratica atividades físicas? ");
    int Atv = input.nextInt();
    if (Atv == 1){
        praticasSaudaveis = praticasSaudaveis + 1;
    }

    System.out.println();
    System.out.print("4-Você possui jogos de console/computador? ");
    int Pc = input.nextInt();
    if (Pc == 1){
        gamer = gamer + 1;
    }

    System.out.println();
    System.out.print("5-Você assiste video clipes de música? ");
    int Clip = input.nextInt();
    if (Clip == 1){
        amanteDeMusicas = amanteDeMusicas + 1;
        amanteDeArtesVisuais = amanteDeArtesVisuais + 1;
    }

    System.out.println();
    System.out.print("6-Você assiste filmes? ");
    int filmes = input.nextInt();
    
    if (filmes == 1){
        amanteDeArtesVisuais = amanteDeArtesVisuais + 1;
    }

    System.out.println();
    System.out.print("7-Você faz algum curso? ");
    int curso = input.nextInt();
    if (curso == 1){
        estudante = estudante + 1;
    }

    System.out.println();
    System.out.print("8- Você realiza algum tipo de dieta? ");
    int dieta = input.nextInt();
    if (dieta == 1){
        praticasSaudaveis = praticasSaudaveis + 1;
    }

    System.out.println();
    System.out.print("9-Você joga jogos mobiles? ");
    int mobile = input.nextInt();
    if (mobile == 1){
        gamer = gamer + 1;
    }

    
    System.out.println();
    System.out.print("10-Você assina aplicativos de música? ");
    int appmsc = input.nextInt();
    if (appmsc == 1){
        amanteDeMusicas = amanteDeMusicas + 1;
    }

    System.out.println();
    System.out.print("11-Você assina aplicativos de streamming? ");
    int appstrm = input.nextInt();
    if (appstrm == 1){
        amanteDeArtesVisuais = amanteDeArtesVisuais + 1;
    }

    
    System.out.println();
    System.out.print("12- Você faz o uso de algum tipo de suplemento? ");
    int supl = input.nextInt();
    if (supl == 1){
        praticasSaudaveis = praticasSaudaveis + 1;
    }







    System.out.println();
    System.out.println("-------------------------");
    System.out.println();
    System.out.println("Com base nas suas respostas, você possui como características:");
    System.out.println();
    System.out.print("Praticas saudaveis: " + praticasSaudaveis + " pt\n" + "Estudante: " + estudante + " pt\n" + "Gamer: " + gamer + " pt\n" + "Amante de Artes Visuais: " + amanteDeArtesVisuais +  " pt\n" + "Amante de músicas: " + amanteDeMusicas+ " pt\n");
    System.out.println();
       

    input.close();
    }
}
