public class Main {

    public static void main(String[] args) {
        Markov markov = new Markov();
        markov.readFile("./test.txt");

int count = 20;
        for(int i=0;i<count;i++){
            System.out.print(markov.randomCouple()+ " ");
        }


    }


}
