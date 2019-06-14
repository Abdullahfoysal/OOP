package p2;

public class OtherPackage {
	OtherPackage(){
		p1.Protection p=new p1.Protection();
		System.out.println("OtherPackage constructor");
//		System.out.println("n = "+p.n);
//		System.out.println("n_pri ="+p.pri);
//		System.out.println("n_pro ="+p.pro);
		System.out.println("n_pub ="+p.n_pub);
	}

}
