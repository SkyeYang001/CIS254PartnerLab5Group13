import java.util.ArrayList;
import java.util.Random;

public class App {
    // public ArrayList<Tile> allTiles;
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Scrabble!");
        ArrayList<Tile> tiles = new ArrayList<Tile>();
        createTiles(tiles);
        ArrayList<Tile> tileSet = getNewTileSet(tiles);
        for (int i = 0; i < tileSet.size(); i++) {
            System.out.print((Character.toLowerCase(tileSet.get(i).getLetter())));
        }
        System.out.println();
        // Random rand = new Random();
        // int randomTile = rand.nextInt(26);
        // System.out.println(randomTile);
        // System.out.println(tiles.get(randomTile));
    }

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

    public static ArrayList<Tile> getNewTileSet(ArrayList<Tile> allTiles) {
        Random randomTileNumber = new Random();
        ArrayList<Tile> Hand = new ArrayList<Tile>();
        for(int i = 0; i < 7; i++) {
            int randomTile = randomTileNumber.nextInt(26);
            Hand.add(new Tile(allTiles.get(randomTile)));
        }
        return Hand;
    }

    public static void canSpell() {
        
    }
}
