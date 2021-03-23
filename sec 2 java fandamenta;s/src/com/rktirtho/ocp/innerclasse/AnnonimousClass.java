package com.rktirtho.ocp.innerclasse;

public class AnnonimousClass {

	abstract class SellProduct {
		abstract int sell(int amount);
	}

	public void selling() {
		SellProduct product = new SellProduct() {

			@Override
			int sell(int amount) {
				// TODO Auto-generated method stub
				return amount * 23;
			}
		};

		

		System.out.println(product.sell(12));
	}
	
	

	public static void main(String[] args) {
		AnnonimousClass class1 = new AnnonimousClass();
		class1.selling();
		
		ClassA a = new ClassA() {
			@Override
			public void printInfo() {
				// TODO Auto-generated method stub
				System.out.println("Prinnt Ann");
			}
		};
		a.printInfo();
	}

}
