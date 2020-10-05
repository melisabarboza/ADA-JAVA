package basico;

public class PracticaOperadores {
	
	int MAX_CANTIDAD_APARICIOS = 25;

	/*
	
operadores sobre enteros
	operador unarios
	A++   aumenta en uno el valor existente. equivalente a  valor = valor + 1
	A-- resta en uno el valor
	
	operadores binarios
	
	A + B   (SUMA)
	A - B   (RESTA)
	A * B   (MULTIPLICACION
	A / B   (DIVISION)
	A % B   (MODULO)
operadores sobre strings
	operadores binarios
	"abc" + "def"  =  "abcdef"
	"abcdef"[3] = "d" 
	"abcdef"[1] = "b" 
	
operadores sobre instancias
	A == B    IGUAL REFERENCIA:comprara las referencias de las dos instancias
	A != B    DISTINTA REFERENCIA: 
operadores sobre booleanos
	A == B   IGUAL    true == true => true
	A != B   DISTINTO true != false => true
	A && B   AND: Y   true && false => false
	A || B   OR: O
tabla de verdad
A==B tabla de verdad de la igualdad
t|t|t
f|t|f
t|f|f
f|f|t

A && B tabla de verdad del and
t|t|t
f|f|f
t|f|f
f|f|t

A||B tabla de verdad del or
t|t|t 
f|t|t
t|t|f
f|f|f


	 */
	
	
	public static void main(String[] args) {
	}
	public static boolean sonIguales(int unNumero, int otroNumero) {
		return unNumero == otroNumero;
	}
	public static boolean sonDistintos(int unNumero, int otroNumero) {
		return unNumero != otroNumero;
	}
	//visibilidad (a nivel de clase si es static) + tipo dato retorno + nombre Metodo + parametros entrada metodo
	public static boolean AND(boolean unBooleano, boolean otroBooleano) {
		return unBooleano && otroBooleano;
	}
	
	public static boolean OR(boolean unBooleano, boolean otroBooleano) {
		return unBooleano || otroBooleano;
	}
}
