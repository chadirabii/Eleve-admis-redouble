import java.util.*;

public class Eleve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int size = sc.nextInt();
        String TELEVE[] = new String[size];
        double TMOY[] = new double[size];
        String TADM[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("- Entrez le nom d'eleve n" + "[" + (i + 1) + "] : ");
            TELEVE[i] = sc.next();
            System.out.print("- Entrez la moyenne de " + (TELEVE[i]) + " : ");
            TMOY[i] = sc.nextDouble();
            while (TMOY[i] > 20) {
                System.out.print(
                        "\t\t\t[ERROR]:La moyenne ne doit etre comprise entre 0 et 20! \n- Entrez la moyenne de l'eleve n"
                                + "[" + (i + 1) + "] : ");
                TMOY[i] = sc.nextDouble();
            }
            if (TMOY[i] < 9) {
                TADM[i] = "Redouble";
            } else if ((TMOY[i] >= 9) && (TMOY[i] < 10)) {
                TADM[i] = "Admis avec rachat";
            } else {
                TADM[i] = "Admis";
            }
        }
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            System.out.print("L'eleve " + TELEVE[i] + " a une moyenne de " + TMOY[i] + " : " + TADM[i] + "\n");
            System.out.println("--------------------------------------------------");
        }

        sc.close();
    }
}