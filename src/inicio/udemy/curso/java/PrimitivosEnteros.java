package inicio.udemy.curso.java;

public class PrimitivosEnteros {

	public static void main(String[] args) {

		byte numeroByte = 127;
		System.out.println("numeroByte = " + numeroByte);
		System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
		System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
		System.out.println("valor maximo de un byte:  " + Byte.MAX_VALUE);
		System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);

		short numeroShort = 32767;
		System.out.println("numeroShort = " + numeroShort);
		System.out.println("tipo short corresponde en byte a " + Short.BYTES);
		System.out.println("tipo short corresponde en bites a " + Short.SIZE);
		System.out.println("valor maximo de un short:  " + Short.MAX_VALUE);
		System.out.println("valor minimo de un short: " + Short.MIN_VALUE);

		int numeroInt = 2147483647;
		System.out.println("numeroInt = " + numeroInt);
		System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
		System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
		System.out.println("valor maximo de un int:  " + Integer.MAX_VALUE);
		System.out.println("valor minimo de un int: " + Integer.MIN_VALUE);

		long numeroLong = 9223372036854775807L; // indicar en el numero con la letra "L" que es de tipo long
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("tipo long corresponde en byte a " + Long.BYTES);
		System.out.println("tipo long corresponde en bites a " + Long.SIZE);
		System.out.println("valor maximo de un long:  " + Long.MAX_VALUE);
		System.out.println("valor minimo de un long: " + Long.MIN_VALUE);

		float numeroFloat = 9223372036854775808F; // indicar en el numero con la letra "F" que es de tipo float
		System.out.println("numeroFloat= " + numeroFloat);
		System.out.println("tipo float corresponde en byte a " + Float.BYTES);
		System.out.println("tipo float corresponde en bites a " + Float.SIZE);
		System.out.println("valor maximo de un float:  " + Float.MAX_VALUE);
		System.out.println("valor minimo de un float: " + Float.MIN_VALUE);

	}

}
