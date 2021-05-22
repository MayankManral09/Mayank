import javax.swing.*; 
public class GuessGame {
    public static void main(String a[]) {
        int cmpnum = (int)(Math.random()*100 + 1);
        int ans = 0;
        System.out.println("The correct guess would be " + cmpnum);
        int count = 1;

        while (ans != cmpnum)
        {
            String res = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 1);
            ans = Integer.parseInt(res);
            JOptionPane.showMessageDialog(null, ""+ tellGuess(ans, cmpnum, count));
            count++;
        }  
    }

    public static String tellGuess(int ans, int cmpnum, int count){
        if (ans <=0 || ans >100) {
            return "Your guess is invalid";
        }
        else if (ans == cmpnum ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (ans > cmpnum) {
            return "Your guess is high, try again.\nTry Number: " + count;
        }
        else if (ans < cmpnum) {
            return "Your guess is low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}

