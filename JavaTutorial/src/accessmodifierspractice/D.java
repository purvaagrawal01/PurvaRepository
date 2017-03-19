package accessmodifierspractice;

class D {
	int i,j;
	private D() {
		// Private Constructor
	}

	private D(int i) {
		// Private constructor
	}

	public D(int i, int j) {
		this.i=i;
		this.j=i;
		System.out.println("X from class D"+this.i);
	}
}