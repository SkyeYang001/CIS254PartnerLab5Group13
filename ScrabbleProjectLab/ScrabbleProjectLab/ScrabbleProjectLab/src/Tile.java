/**
 * Homework 13
 * Description:
 * Tile class, creates a tile assigned to the called letter with their
 * containing their direct value scores.
 * 
 * @author Skye Yang
 * @since 11/06/2025
 */

public class Tile {
    private char letter;
    private int value;

    /**
     * The default constructor method
     * 
     * @param letter
     * @param value
     */
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    /**
     * This method creates the objects tile letter and value
     * 
     * @param obj
     */
    public Tile(Tile obj) {
        this.letter = obj.letter;
        this.value = obj.value;
    }

    /**
     * This method sets tile letter with the value argument
     * 
     * @param letter
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }

    /**
     * This method sets tile value with the value argument
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * This method gets tile letter
     * 
     * @return tile's letter
     */
    public char getLetter() {
        return this.letter;
    }

    /**
     * This method gets tile value
     * 
     * @return tile's value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * If tile equals to another tile
     * 
     * @param other
     * @return true, if both tiles are equal
     */
    public boolean equals(Tile other) {
        return this.letter == other.letter;
    }

    /**
     * Creates a string, telling the tile's letter and value
     * 
     * @return printed string
     */
    public String toString() {
        return String.format("%c - %d", letter, value);
    }

    /**
     * Increasing score by the tile's value
     * 
     * @param score
     * @return score added with tile's value
     */
    public int addScore(int score) {
        return score + value;
    }

    /**
     * Adds the tile's letter to word
     * 
     * @param word
     * @return word added with tile's letter
     */
    public String addWord(String word) {
        return word + letter;
    }
}
