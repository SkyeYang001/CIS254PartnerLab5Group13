
/**
* Lab 5
* Description: Scrabble game, the user is shown a set of random letters and spells a word out of the letters.
* 
* @author Skye Yang
* @author Servando Lozoya
* @since 11/18/2025
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    // private ArrayList<Tile> allTiles;

    /**
     * Main Method plays the scrabble game
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Scrabble!");
        ArrayList<Tile> tiles = new ArrayList<Tile>();
        createTiles(tiles);
        Scanner input = new Scanner(System.in);
        String word;
        String answer;
        char letter;
        int score = 0;
        do {
            ArrayList<Tile> tileSet = getNewTileSet(tiles);
            System.out.print("Here is your title set: ");
            for (int i = 0; i < tileSet.size(); i++) {
                System.out.print((Character.toLowerCase(tileSet.get(i).getLetter())));
            }
            System.out.println();
            word = new String(input.next());
            if (canSpell(word, tileSet) == true) {
                System.out.println("Yes, can spell " + word);
                for (int index = 0; index < word.length(); index++) {
                    letter = word.charAt(index);
                    for (int i = 0; i < tileSet.size(); i++) {
                        if (letter == (Character.toLowerCase(tileSet.get(i).getLetter()))) {
                            score = score + tileSet.get(i).getValue();
                            break;
                        }
                    }
                }
            } else if (canSpell(word, tileSet) == false) {
                System.out.println("No, cannot spell " + word);
            } else {
                System.out.println("error.");
            }
            System.out.print("Do you want to continue? (Y/N): ");
            answer = input.next();
        } while (answer.equalsIgnoreCase("Y"));
        input.close();
        System.out.printf("Goodbye! Your score is %d\n", score);
    }

    /**
     * Creates the tiles for all letters
     * 
     * @param tiles
     */
    public static void createTiles(ArrayList<Tile> tiles) {
        tiles.add(new Tile('A', 1));
        tiles.add(new Tile('B', 3));
        tiles.add(new Tile('C', 3));
        tiles.add(new Tile('D', 2));
        tiles.add(new Tile('E', 1));
        tiles.add(new Tile('F', 4));
        tiles.add(new Tile('G', 2));
        tiles.add(new Tile('H', 4));
        tiles.add(new Tile('I', 1));
        tiles.add(new Tile('J', 8));
        tiles.add(new Tile('K', 5));
        tiles.add(new Tile('L', 1));
        tiles.add(new Tile('M', 3));
        tiles.add(new Tile('N', 1));
        tiles.add(new Tile('O', 1));
        tiles.add(new Tile('P', 3));
        tiles.add(new Tile('Q', 10));
        tiles.add(new Tile('R', 1));
        tiles.add(new Tile('S', 1));
        tiles.add(new Tile('T', 1));
        tiles.add(new Tile('U', 1));
        tiles.add(new Tile('V', 4));
        tiles.add(new Tile('W', 4));
        tiles.add(new Tile('X', 8));
        tiles.add(new Tile('Y', 4));
        tiles.add(new Tile('Z', 10));
    }

    /**
     * Creates the tileset
     * 
     * @param allTiles
     * @return hand
     */
    public static ArrayList<Tile> getNewTileSet(ArrayList<Tile> allTiles) {
        Random randomTileNumber = new Random();
        ArrayList<Tile> Hand = new ArrayList<Tile>();
        for (int i = 0; i < 7; i++) {
            int randomTile = randomTileNumber.nextInt(26);
            // Hand.add(new Tile(allTiles.get(randomTile)));
            Hand.add(new Tile(allTiles.get(randomTile)));
        }
        return Hand;
    }

    /**
     * If the user's input is correct
     * 
     * @param word
     * @param tileSet
     * @return true or false
     */
    public static Boolean canSpell(String word, ArrayList<Tile> tileSet) {
        ArrayList<Character> set = new ArrayList<>();

        for (Tile t : tileSet) {
            set.add(Character.toLowerCase(t.getLetter()));
        }

        for (char c : word.toLowerCase().toCharArray()) {
            if (!set.remove((Character) c)) {
                return false;
            }
        }

        return true;

    }
}
