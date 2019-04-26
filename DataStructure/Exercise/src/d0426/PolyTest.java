package d0426;

public class PolyTest {

	public static void main(String[] args) {
		Poly A = new Poly();
		Poly B = new Poly();
		
		A.addTerm(2, 1);
		A.addTerm(1, 0);
		A.addTerm(3, 2);
		System.out.print("���׽� A(x) = ");
		A.printPoly();
		System.out.println();
		A.addTerm(-3, 1);
		System.out.print("���׽� A(x) = ");
		A.printPoly();
		System.out.println();
		
		B.addTerm(2, 2);
		B.addTerm(1, 1);
		B.addTerm(3, 0);
		System.out.print("���׽� B(x) = ");
		B.printPoly();
		System.out.println();
		
		Poly C = A.addPoly(B);
		System.out.print("���׽� C(x) = A(x) + B(x) = ");
		C.printPoly();
		System.out.println();
		
		Poly D = A.multiTerm(2,1);
		System.out.print("���׽� D(x) = A(x) * 2x+1 = ");
		D.printPoly();
		System.out.println();
		
		Poly E = A.multiPoly(B);
		System.out.println("���׽� E(x) = A(x) * B(x) = ");
		E.printPoly();
		System.out.println();

	}

}
