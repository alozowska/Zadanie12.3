import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Wystapienia {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("liczby.txt");
        TreeMap<Integer, Integer> set=new TreeMap<>();
        Scanner scanner = new Scanner(file);
        Integer [] tablica=new Integer[6];
        Integer licznik=0;
        for (int i = 0; i < tablica.length; i++) {
          tablica[i]=scanner.nextInt();
          Integer singelNumber=tablica[i];
          licznik=set.get(singelNumber);
          if (licznik==null){
              licznik=0;
          }
          licznik++;
          set.put(singelNumber,licznik);
        }
        System.out.println(set);

    }
}
