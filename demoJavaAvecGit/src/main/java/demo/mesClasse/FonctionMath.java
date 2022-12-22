package demo.mesClasse;

public class FonctionMath {
	public double addition(double a,double b) {
		return a+b;
	}
	public double factoriel(double nombre) {
		if(nombre<1) {
			throw new FactorielException();
		}
		double fact=1;
		for(int i=1;i<=nombre;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
