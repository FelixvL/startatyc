class Demo{
	public static void main(String[] args){
/// primitive 8 int short long byte boolean double float char   // 0 false 0.0
/// Object type unlimited create your own - INSTANTIATED        // null
////	primitives type name AND value on the stack
////	object types type name on the stack with a pointer to the object on the heap
////   primitive copy the value to the parameter
///	object copy of the reference to the parameter

		Getal getal = new Getal();
		getal.getal = 0;
		go(getal.getal);
		System.out.println(getal.getal);



	}
	static void go(int x){
		x++;
	}
	
}


class Getal{
	int getal;
}
