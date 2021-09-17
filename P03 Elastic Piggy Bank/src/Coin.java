//////////////// FILE HEADER //////////////////////////
//
// Title: P03 Elastic Piggy Bank
// Files: ElasticBank, ElasticTester, Coin
// Course: CS300,Spring, 2020
//
// Author: Meng Tian
// Email: mtian42@wisc.edu
// Lecturer's Name: Gary Dahl
/**
 * Objects of this class represent a coin. Each Coin object has its name and value It can be change
 * to the form (name, value)
 */
public class Coin {

  private String name;
  private int value;

  /**
   * Creates and initializes a new ElasticBank object.
   * 
   * @param name  the name of the coin
   * @param value the value of the coin
   */
  public Coin(String name, int value) {
    this.name = name;
    this.value = value;
  }

  /**
   * Returns the name of the coin
   * 
   * @return the name of the coin
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the value of the coin
   * 
   * @return the value of the coin
   */
  public int getValue() {
    return value;
  }

  /**
   * Retrieves text representation of this coin object.
   * 
   * @return text representation of this coin
   */
  public String toString() {
    String s = "(" + name + ", " + value + ")";
    return s;
  }
}
