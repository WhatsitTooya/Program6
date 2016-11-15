public interface ListS {
	/**
	 * Appends the specified String to the end of this list
	 * @param data
	 * @return boolean
	 */
	boolean add(String data);

	/**
	 * Adds the specified String to the list at index and moves
	 * any element at that index or higher to their (current index + 1)
	 * @param index
	 * @param data
	 * @return boolean
	 */
	boolean add(int index, String data);

	/**
	 * Removes all of the Strings from this list
	 */
	void clear();

	/**
	 * Returns true if this list contains the specified String
	 * @param data
	 * @return boolean
	 * Implementation hint:  call indexOf()
	 */
	boolean contains(String data);

	/**
	 * Returns the String at the specified position in this list
	 * @param index
	 * @return String
	 * @throws Exception if index < 0 or index >= size
	 */
	String get(int index);

	/**
	 * Set value to element at index
	 * @param index
	 * @param value
	 * @throws IndexOutOfBoundsException if index < 0 or index >= size
	 */
	public void set(int index, String value);
	
	/**
	 * Returns the index of the first occurrence of the specified String in this list, or -1 if this list does not
	 * contain the String
	 * @param data
	 * @return int
	 */
	int indexOf(String data);

	/**
	 * Returns true if this list contains no Strings
	 * @return boolean  true if size is zero
	 */
	boolean isEmpty();

	/**
	 * Trims the capacity of this MyList instance to be the list's current size. An application can use this
	 * operation to minimize the storage of an MyList instance.
	 */
	void trimToSize();

	/**
	 * Returns the number of Strings in this list
	 * @return int  size of list
	 */
	int size();

}

