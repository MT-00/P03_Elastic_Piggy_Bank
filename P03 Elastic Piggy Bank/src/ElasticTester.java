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
 * Test the method created in the ElasticBank class and the Coin class including both the
 * instantiable class, the accessors and mutators
 */
public class ElasticTester {
  /**
   * Checks whether Coin object works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testCoinInstantiableClass() {
    // create two coin objects
    Coin penny = new Coin("PENNY", 1);
    Coin quarter = new Coin("QUARTER", 25);
    // check if the method can get their names and values
    if (!penny.getName().equals("PENNY"))
      return false;
    if (penny.getValue() != 1)
      return false;
    if (!quarter.getName().equals("QUARTER"))
      return false;
    if (quarter.getValue() != 25)
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.capacity() object works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testCapacityAccessors() {
    // create three elasticbank objects
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    ElasticBank three = new ElasticBank(1);
    // add coins to three banks
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("QUARTER", 25));
    one.addCoin(new Coin("DIME", 10));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("SILVER", 5));
    two.addCoin(new Coin("GOLDEN", 5));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    // check if the method can get the correct capacity
    // scenario 1 - one expansion
    if (one.capacity() != 15)
      return false;
    // scenario 2 - no expansion need
    if (two.capacity() != 7)
      return false;
    // scenario 3 - spilling bank
    if (three.capacity() != 21)
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.getExpansions() object works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testGetExpansionsAccessors() {
    // create three elasticbank objects
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    ElasticBank three = new ElasticBank(1);
    // add coins to three banks
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("QUARTER", 25));
    one.addCoin(new Coin("DIME", 10));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("SILVER", 5));
    two.addCoin(new Coin("GOLDEN", 5));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    // check if the method can get the correct expansion times
    // scenario 1 - one expansion
    if (one.getExpansions() != 1)
      return false;
    // scenario 2 - no expansion
    if (two.getExpansions() != 2)
      return false;
    // scenario 3 - spilling bank
    if (three.getExpansions() != 0)
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.getSize() object works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testGetSizeAccessors() {
    // create three elasticbank objects
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    ElasticBank three = new ElasticBank(1);
    // add coins to three banks
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("QUARTER", 25));
    one.addCoin(new Coin("DIME", 10));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("SILVER", 5));
    two.addCoin(new Coin("GOLDEN", 5));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    // check if the method can get the correct size
    // scenario 1 - one expansion
    if (one.getSize() != 6)
      return false;
    // scenario 2 - no expansion
    if (two.getSize() != 1)
      return false;
    // scenario 3 - spilling bank
    if (three.getSize() != 1)
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.getBalance() object works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testBalanceAccessors() {
    // create two elasticbank objects
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    // add coins to the banks
    one.addCoin(new Coin("PENNY", 1));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("NICKEL", 5));
    two.addCoin(new Coin("PENNY", 1));
    two.addCoin(new Coin("NICKEL", 5));
    //two.empty();
    // check if the method can get the correct balance
    if (one.getBalance() != 1)
      return false;
    if (two.getBalance() != 46)
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.getCoins() works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testGetCoinsAccessors() {
    // create two elasticbank objects
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    // add coins to banks
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("QUARTER", 25));
    one.addCoin(new Coin("DIME", 10));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("SILVER", 5));
    two.addCoin(new Coin("GOLDEN", 5));
    // check if the method can get the information of all coin
    if (!one.getCoins()
        .equals("(PENNY, 1) (QUARTER, 25) (DIME, 10) (PENNY, 1) (PENNY, 1) (SILVER, 5)"))
      return false;
    if (!two.getCoins().equals("(GOLDEN, 5)"))
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.removeCoin() works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testRemoveCoinMutators() {
    // create two elasticbank objects
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    ElasticBank three = new ElasticBank();
    // add coins in the banks
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("DIME", 10));
    two.addCoin(new Coin("NICKEL", 5));
    // check if the method can get the coin object that removed from the bank
    // scenario 1 - successfully removed
    Coin target1 = one.removeCoin();
    if ((target1.getName() != new Coin("PENNY", 1).getName()
        && target1.getName() != new Coin("DIME", 10).getName()))
      return false;
    if (target1.getValue() != new Coin("PENNY", 1).getValue()
        && target1.getValue() != new Coin("DIME", 10).getValue())
      return false;
    // scenario 2 - successfully removed
    Coin target2 = two.removeCoin();
    if (target2.getName() != new Coin("NICKEL", 5).getName())
      return false;
    if (target2.getValue() != new Coin("NICKEL", 5).getValue())
      return false;
    // scenario 3 - empty bank
    Coin target3 = three.removeCoin();
    if (target3 != null)
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.empty() works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testEmptyMutators() {
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    // add coins to banks
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("QUARTER", 25));
    one.addCoin(new Coin("DIME", 10));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("SILVER", 5));
    // check if the method can empty the bank
    // scenario 1 - empty successfully
    one.empty();
    if (one.capacity() != 15)
      return false;
    if (one.getSize() != 0)
      return false;
    // scenario 2 - empty bank already
    two.empty();
    if (two.capacity() != 7)
      return false;
    if (two.getSize() != 0)
      return false;
    return true;
  }

  /**
   * Checks whether ElasticbBank.addCoin() works as expected.
   * 
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testAddCoinMutators() {
    // create three elasticbank objects
    ElasticBank one = new ElasticBank(5);
    ElasticBank two = new ElasticBank(7);
    ElasticBank three = new ElasticBank(1);
    // add coins to three banks
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("QUARTER", 25));
    one.addCoin(new Coin("DIME", 10));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("PENNY", 1));
    one.addCoin(new Coin("SILVER", 5));
    two.addCoin(new Coin("GOLDEN", 5));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("QUARTER", 25));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("DIME", 10));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("NICKEL", 5));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    three.addCoin(new Coin("PENNY", 1));
    // check if the method can add coins and expand the capacity right
    // scenario 1 - no need to expand
    if (one.capacity() != 15)
      return false;
    if (one.getSize() != 6)
      return false;
    // scenario 2 - need expansion
    if (two.capacity() != 7)
      return false;
    if (two.getSize() != 1)
      return false;
    // scenario 3 - spilling coin without expansions left
    if (three.capacity() != 21)
      return false;
    if (three.getSize() != 1)
      return false;
    return true;
  }

  public static void main(String[] arg) {
    System.out.println(ElasticTester.testCoinInstantiableClass());
    System.out.println(ElasticTester.testBalanceAccessors());
    /*System.out.println(ElasticTester.testGetCoinsAccessors());
    System.out.println(ElasticTester.testRemoveCoinMutators());
    System.out.println(ElasticTester.testEmptyMutators());
    System.out.println(ElasticTester.testAddCoinMutators());
    System.out.println(ElasticTester.testCapacityAccessors());
    System.out.println(ElasticTester.testGetExpansionsAccessors());
    System.out.println(ElasticTester.testGetSizeAccessors());*/
  }
}
