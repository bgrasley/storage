/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

/**
 * An array-based data structure for ints with a linear index. Indices start at
 * 0.
 *
 * @author Brandon Grasley - initial structure and code stubs
 * @author Your Name Here
 */
public class LinearIntStore {

  //When you name a small number of variables well, don't "overdocument" them.
  private int numElements;
  private int[] data;
  private static final int INITIAL_CAPACITY = 16; //must be at least 1

  /**
   * Create a new LinearIntStore with no stored data.
   */
  public LinearIntStore() {
    //create a new array
    numElements = 0;
    data = new int[INITIAL_CAPACITY];
  }

  /**
   * Store newValue at index. If there is data already stored at index, that
   * value and all values beyond will be shifted up by one position to make room
   * for newValue at index.
   *
   * @param newValue The value to be stored
   * @param index The index at which to store newValue. If index is more than
   * one position past the last stored value or if it is negative, an
   * ArrayIndexOutOfBoundsException will be thrown.
   */
  public void insertElementAt(int newValue, int index) throws ArrayIndexOutOfBoundsException {
    //code stub - complete this!

    //check that index is valid
    //increase size if necessary
    if (data.length == numElements) {
      doubleCapacity();
    }

    //shuffle values down from index
    //insert newValue at index
  }

  /**
   * Get the current number of elements stored in this
   *
   * @return the number of elements stored in this
   */
  public int getSize() {
    return numElements;
  }

  /**
   * Double the capacity of the array that is storing data. Used especially when
   * trying to insert an element in a full array.
   */
  private void doubleCapacity() {
    //code stub - complete this!
  }

  /**
   * Remove and return the value stored at index. All values beyond will be
   * shifted down by one position to fill in the gap at index.
   *
   * @param index The index from which to remove the value. If index is beyond
   * the last stored value or if it is negative, an
   * ArrayIndexOutOfBoundsException will be thrown.
   * @return the int value stored at index
   */
  public int removeElementAt(int index) throws ArrayIndexOutOfBoundsException {
    //code stub - complete this!
    return 0;
  }

  /**
   * Return the value stored at index without removal.
   *
   * @param index The index from which to retrieve the value. If index is beyond
   * the last stored value or if it is negative, an
   * ArrayIndexOutOfBoundsException will be thrown.
   * @return the int value stored at index
   */
  public int getElementAt(int index) throws ArrayIndexOutOfBoundsException {
    //code stub - complete this!
    
    if (index < 0 || index > numElements-1) throw new ArrayIndexOutOfBoundsException();
    
    return 0;
  }

  /**
   * Insert value at the end of the structure.
   *
   * @param value The value to insert.
   */
  public void append(int value) {
    insertElementAt(value, numElements);
  }

  /**
   * Empty the current structure of all values
   */
  public void clear() {
    numElements = 0;  //it doesn't matter that the values are still there!
  }

  /**
   * Returns a String representation of the values stored in this. The values
   * are formatted as comma-separated values, such as "3,-5,4,2,0".
   *
   * @return a String representation of this with comma-separated values.
   */
  public String toString() {
    //code stub - complete this!
    String returnString = "";
    for (int i = 0; i < numElements; i++) {
      if (i == 0) {
        returnString = "" + i;
      } else {
        returnString = returnString + "," + i;
      }
    }
    return returnString;
  }

  /**
   * Search for value in this. Return the smallest index at which value is
   * found, or return -1 if it is not stored in this.
   *
   * @param value The int value to search for
   * @return the smallest index at which value is found in this
   */
  public int getIndexOf(int value) {
    //code stub - complete this!
    return 0;
  }

  /**
   * Search for value in this. Return the smallest index at which value is
   * found, beginning at startingIndex, or return -1 if it is not stored in this
   * beginning at startingIndex.
   *
   * @param value The int value to search for
   * @param startingIndex The index to begin searching from
   * @return the smallest index at which value is found in this beginning at
   * startingIndex
   */
  public int getIndexOf(int value, int startingIndex) {
    //code stub - complete this!
    return 0;
  }

  /**
   * Reduce the size of the data structure as much as possible by removing all
   * remaining capacity.
   *
   * @return the reduction in capacity as a number of int storage positions
   */
  public int compress() {

    //What if it's full? We're not saving anything, so return 0 without changes
    if (data.length == numElements) {
      return 0;
    }

    int oldCapacity = data.length;
    int[] tempData = new int[numElements];

    //copy the values from the old array into the new array
    for (int i = 0; i < numElements; i++) {
      tempData[i] = data[i];
    }

    //reassign to new array
    data = tempData;

    int savings = oldCapacity - data.length;

    return savings;
  }

}
