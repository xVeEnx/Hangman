import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedSet;

public class Hangman {

    private String haslo;
    private String twojeHaslo;
    private int hasloLen;

    public Hangman(String pole) {
        haslo = pole;
        twojeHaslo = "";
        hasloLen = pole.length();
        for (int i = 0; i < hasloLen; i++) {
            if (pole.charAt(i) == 32) twojeHaslo += " ";
            twojeHaslo += "-";
        }
        System.out.println(twojeHaslo);
    }

    public String getHaslo() {
        return haslo;
    }

    public boolean equals(String pole) {
        if (haslo.equals(twojeHaslo)) return true;
        return false;
    }
    public String change(char achar,Hang zycia)
    {
        boolean isIt=false;
        String result=new String("");
        for(int i=0;i<hasloLen;i++)
        {
            if(haslo.charAt(i)!=achar)
            {
                result+=twojeHaslo.charAt(i);
            }
            else {
                result+=achar;
                isIt=true;
            }
        }
        if(isIt==true) System.out.println("Zgadles litere stan hasla to: ");
        else {
            System.out.println("Niestety tej litery nie ma w hasle, probój dalej");
            zycia.minusLive();
        }
        twojeHaslo=result;
        return result;
    }


}