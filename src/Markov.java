import java.io.File;
import java.util.*;

public class Markov {
    private HashSet<Couple> couples;
    private Random random;
    private Scanner scanner;

    public Markov() {
        couples = new LinkedHashSet<>();
        random = new Random();
    }

    public void readFile(String path) {
        try {
            File file = new File(path);

        scanner = new Scanner(file);
        scanner.useDelimiter(" ");

        String first = null;
        String second = null;

        while (this.scanner.hasNext()) {
            first = scanner.next();
            if(first!=null && second!=null ) couples.add(new Couple(second, first));

            second = scanner.next();
            if(first!=null && second!=null ) couples.add(new Couple(first, second));
        }

        couples.add(new Couple(first, second));

        }catch (Exception e){
            System.out.println(e);
        }

    }


    public String generateText() {
        return "";
    }

    public String randomCouple() {
        int tmp = random.nextInt(this.couples.size());
        int i =0;
        for(Couple c : couples){
            if(i==tmp){
                return c.getString();
            }
            i++;
        }
        return "";
    }


}
