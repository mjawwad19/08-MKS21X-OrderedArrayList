public class DriveOrderedList {
	public static void main(String[] args) {
		NoNullArrayList<String> array = new NoNullArrayList<>();
    int errorCount = 0;
			array.add("hey");
      System.out.println(array); //[hey]
			array.add(0,"erm?");
			System.out.println(array);// [erm?, hey]
			array.set(1,"hi");
			System.out.println(array); // [erm?, hi]
    try { array.set(1,null); //should throw an error
    } catch (IllegalArgumentException e) {
      errorCount++;
      System.out.println("You cannot set a null, this should cause error count to go up");
      System.out.println(errorCount); //1
		}

	  try {
      array.add(null);
    } catch (IllegalArgumentException e) {
      errorCount++;
      System.out.println("You cannot add a null, this should cause error count to go up");
      System.out.println(errorCount); //2
    }
		try {
				array.add(0,null);
    } catch (IllegalArgumentException e) {
      errorCount++;
      System.out.println("You cannot add a null, this should cause error count to go up") ;
      System.out.println(errorCount); //3
    }

		OrderedArrayList<String> oArray = new OrderedArrayList<>();
			oArray.add("a");
			oArray.add("c");
			oArray.add("b");
			System.out.println(oArray); // [a, b, c] if you ordered correctly
			oArray.add(2,"d");
			oArray.add(1,"e");
			oArray.add(0,"f");
			System.out.println(oArray); // [a, b, c, d, e, f]
      if (! (""+oArray).equals("[a, b, c, d, e, f]")) {
        errorCount++;
        System.out.println("Your Ordered class add is wack!");
      } //shouldn't yield an error if u did right tho

    try {
      oArray.add(null);
    } catch (IllegalArgumentException e) {
      errorCount++;
      System.out.println("You cannot add a null, this should cause error count to go up ");
      System.out.println(errorCount); //4
    }
    try {
      oArray.set(2, null);
    } catch (IllegalArgumentException e) {
      errorCount++;
      System.out.println("You cannot add a null, this should cause error count to go up");
      System.out.println(errorCount); //5
    }

    oArray.set(0, "h");
    System.out.println(oArray); //[b, c, d, e, f, h]
    oArray.set(1, "b");
    System.out.println(oArray); //[b, b, d, e, f, h]
    oArray.set(2, "j");
    System.out.println(oArray); //[b, b, e, f, h, j]
    oArray.set(3, "r");
    System.out.println(oArray); //[b, b, e, h, j, r]
    oArray.set(4, "n");
    System.out.println(oArray); //[b,b, e, h, n, r]
    oArray.set(5, "t");
    System.out.println(oArray); // [b, b, e, h, n, t]
    if (! (""+oArray).equals("[b, b, e, h, n, t]")) {
      errorCount++;
      System.out.println("You really need to check your sorting and adding methods");
      System.out.println(errorCount);
    } //this should just end addd [b, b, e, h, n, t] if u did right
   if (errorCount == 5) System.out.println("You have everything right!");
   else {System.out.println("You screwed up");}
 }
}
