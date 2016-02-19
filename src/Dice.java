/**
 * Created by zazulam on 2/18/16.
 */
public class Dice {
    public int rollDice(int shotbonus){
        int die = rand.nextInt(6)+1);
        die += shotbonus;
        return die;
    }
}
