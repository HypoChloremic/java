
class ForLoopsApp{
	 public static void main(String[] args) {
	 	// So we are learning several things here
	 	// Firstly that we create an array of integers 
	 	// in the given way. 
	 	// Secondly that we provide the list with curly braces. 
		int[] z = {1,2,3};
		int o = loop(z);
		System.out.print(o);
	}

	// Static means that we can access the method 
	// without necessarily acessing the class. 
	// It is shared by the entire class
	// Private will only be accessible by shit within the class
	// and wont be callable from the outside. 
	private static int loop(int[] values){
		int o;
		o = values[2];
		for (int i=0; i<100; i++) {
			o = o+i;

			
		}
		return o;
	} 
	public static void printer(){

		// System.out.print();
	}
}