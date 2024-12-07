/**
 * The Part class is a parent class that will be extended by child classes to
 * represent common parts added to vehicles, e.g., tires and engines. There
 * will be two additional child classes between Tire and Engine, representing
 * a Part that is unique in the class and a part that is often added in groups.
 * See PartGroup and UniquePart for more.
 */

	/**
	 * Full constructor. Sets all private attributes.
	 * 
	 * @param id : int
	 * @param partNo : String
	 * @param price : double
	 */
	
	/**
	 * Accessor id for part's identifier
	 * 
	 * @return Value of identifier
	 */
	
	/**
	 * Accessor partNo for part's part number
	 * 
	 * @return Value of part number
	 */
	
	/**
	 * Accessor price for part's price
	 * 
	 * @return Value of part price
	 */
	
	/**
	 * The equals method compares two parts based on their part identifier
	 * attributes.
	 * 
	 * @param rhs : Part The right-hand-side of this == rhs
	 * 
	 * @return True if the two Parts' identifiers are the equal.
	 */
	
	/**
	 * The toString method builds a comma-delimited concatenation of the
	 * three attributes.
	 * 
	 * The identifier is displayed as a 10 digit integer, left-padded with zeros
	 * if it is less than 10 digits.
	 * ", "
	 * The part number is second.
	 * ","
	 * The price is given with a leading dollar sign and is rounded to two digits.
	 * 
	 * @return The string described above.
	 */
	
