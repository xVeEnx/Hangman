import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Podaj haslo: ");
        Scanner skan=new Scanner(System.in);
        String pole=new String(skan.nextLine());
        Hangman gra=new Hangman(pole);
        Hang zycia=new Hang();
        while (!gra.equals(pole)&&zycia.getLives()>0)
        {
            System.out.println("Masz "+zycia.getLives()+" żyć");
            System.out.println("Wpisz litere ktora zgadujesz: ");
            char twojaLitera;
            twojaLitera=skan.next().charAt(0);
            System.out.println(gra.change(twojaLitera,zycia));

        }
        if(zycia.getLives()<0)
        {
            System.out.println("Niestety straciles wszystkie zycia");
        }
        else
        System.out.println("Odgadles haslo Gratulacje! ");
    }
}
