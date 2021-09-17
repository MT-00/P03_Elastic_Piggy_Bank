//////////////// FILE HEADER //////////////////////////
//
// Title: P03 Elastic Piggy Bank
// Files: ElasticBank, ElasticTester, Coin
// Course: CS300,Spring, 2020
//
// Author: Meng Tian
// Email: mtian42@wisc.edu
// Lecturer's Name: Gary Dahl
import java.util.Random;

// class header: ElasticBank, which is a () including an array of Coins with parameter size,
// expansion times, capacity and balance.
// its function includes add coin, remove coin, empty the bank
// meanwhile, the coins contained in the bank can be displayed
/**
 * Objects of this class represent a ElasticBank. In addition to storing the capacity set by either
 * the user or the default, each ElasticBank object can hold an array of coins, the size/expansions
 * time of the array.
 */
public class ElasticBank {

  private Coin[] coins;// create an array of Coins
  private int size = 0;// initialize the size to be zero
  private int expansionsLeft = 2;// initialize the expansion time is two
  private static Random rand = new Random(100);// initialize the random object with seed value 100

  /**
   * Creates and initializes a new ElasticBank object.
   */
  public ElasticBank() {
    this.size = 0;
    this.coins = new Coin[10];// the default capacity of the array is 10
  }

  /**
   * Creates and initializes a new ElasticBank object.
   * 
   * @param initialCapacity describes the capacity set by the user
   */
  public ElasticBank(int initialCapacity) {
    this.size = 0;
    this.coins = new Coin[initialCapacity];// the capacity of the array is the initialCapacity
  }

  /**
   * Returns the capacity of a elastic bank
   * 
   * @return the capacity of the coins set by either the user or the default (10) (int type)
   */
  public int capacity() {
    int capacity = coins.length;// the capacity equals the array of coins'length
    return capacity;
  }

  /**
   * Returns the expansion time left of a elastic bank
   * 
   * @return the expansion times left of a elastic bank (int type)
   */
  public int getExpansions() {
    return expansionsLeft;
  }

  /**
   * Returns the size of the coins array in cents
   * 
   * @return the total number of the coins held in a elastic bank
   */
  public int getSize() {
    return size;
  }

  /**
   * Returns the balance of a elastic bank in cents
   * 
   * @return the total value of the coins held in a elastic bank in cents
   */
  public int getBalance() {
    int totalValue = 0;

    for (int i = 0; i < size; i++) // check all coins stored in the array
    {
      totalValue += coins[i].getValue();
    }
    return totalValue;
  }

  /**
   * Returns a string represents all coins in elastic bank
   * 
   * @return all coins held in a elastic bank in the form (name, value) with space in between
   */
  public String getCoins() {
    String coinsList = new String();// create a coin list in string type to return at last

    for (int i = 0; i < this.size; i++) {
      if (i < this.size - 1)// check if there is coin after
        coinsList = coinsList + coins[i].toString() + " ";// if yes, then add a space after the
                                                          // parentheses
      else
        coinsList = coinsList + coins[i].toString();// if no, just print out the coin
    }
    return coinsList;
  }

  /**
   * Remove a random coin stored in elastic bank
   * 
   * @return a Coin object that is removed from the elastic bank
   */
  public Coin removeCoin() {
    boolean target;
    int remCoinValue;
    String remCoinName;
    if (size == 0) {// check if there is any coin stored
      System.out.print("Tried to remove a coin, but could not because the piggy bank is empty.\n");// if
                                                                                                   // there
                                                                                                   // is
                                                                                                   // no
                                                                                                   // coin
                                                                                                   // in
                                                                                                   // the
                                                                                                   // bank,
                                                                                                   // print
                                                                                                   // out
                                                                                                   // a
                                                                                                   // wrong
                                                                                                   // message
      return null;
    } else {
      int r = rand.nextInt(size);// generate a random site of the array
      remCoinValue = coins[r].getValue();// find the value of that coin
      remCoinName = coins[r].getName();// find the name of that coin
      Coin removedCoin = new Coin(remCoinName, remCoinValue);
      coins[r] = null;// assign the coin value to 0
      // refill the empty spot
      target = false;// set the signal to false first
      for (int i = 0; i < size; i++) {// go over all coins stored in the array
        if (target) {// check if the signal is true
          for (int index2 = i; index2 < size; index2++)// check where is the next nonzero elements
          {
            if (coins[index2].getValue() != 0)// if the nonzero elements is founded
            {
              // change the spot of these two elements
              Coin sub = coins[i - 1];
              coins[i - 1] = coins[index2];
              coins[index2] = sub;
            }
          } // if it is, then the following coins move one step forward
        }
        if (coins[i] == null) {// check if the coin value is 0
          target = true;// if it is, then the target changes to true
        }
      }
      size = size - 1;// the number of coins held decreases 1
      System.out.println("Removed a " + remCoinName + ".");// print out a notice
      return removedCoin;
    }
  }

  /**
   * Empty elastic bank
   */
  public void empty() {
    int sumRemoved;
    if (size == 0) {// check if there is any coins stored
      System.out.print("Zero coin removed. The piggy bank is already empty.\n");// if it is
                                                                                // empty,print out a
                                                                                // warning message
    } else {// if it is not empty
      sumRemoved = getBalance();// calculate the sum of all coins
      for (int i = 0; i < size; i++) {
        coins[i] = null;
      } // empty the array
      size = 0;// the size is reset to 0
      System.out.print("All done. " + sumRemoved + " cents removed.\n");// print out a message to
                                                                        // notify the user
    }
  }

  /**
   * Add a coin into elastic bank
   * 
   * @param c the coin need to be added in the elastic bank
   * @return a Coin object that is removed from the elastic bank
   */
  public void addCoin(Coin c) {
    // check if the array is full
    if (this.size < this.capacity()) {// if no, add the coin and print out a message
      coins[size] = c;
      this.size = this.size + 1;// the size of the array adds one
      System.out.println("" + "Added a " + c.getName() + ".");
    } else {// if yes, print out a message first
      System.out.println("The bank is full and " + this.expansionsLeft + " expansions left.");
      // check if there is expansion time left
      if (expansionsLeft > 0) {// if yes, expand the capacity for one time
        Coin[] coinsExpand = new Coin[capacity() + 10];// create a new array called coinsExpand
                                                       // which has the expanded capacity
        // clone all the coins stored in the array of coins
        for (int i = 0; i < size; i++) {
          coinsExpand[i] = coins[i];
        }
        coins = coinsExpand;// expand the coins array
        size = size + 1;// the size adds one
        coins[size - 1] = c;// store the new coin
        System.out
            .println("" + "Added a " + c.getName() + ". And the expansion time decreases one.");// print
                                                                                                // out
                                                                                                // a
                                                                                                // message
        expansionsLeft = expansionsLeft - 1;// the expansion time decreases one
      } else {// if there is no expansion time left
        System.out.println("The bank will be empty and then add the new coin. ");// print out a
                                                                                 // message
        for (int i = 0; i < size; i++) {
          coins[i] = null;
        } // empty the array
        coins[0] = c;// store the new coin
        size = 1;// the total number of coins in the array is one
      }
    }
  }

}
