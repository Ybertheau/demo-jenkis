package demo.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demo.mesClasse.FonctionMath;

class MaClassDeTest  {
	FonctionMath fct;
	@BeforeEach
	void init() {
		fct=new FonctionMath();
	}
	@AfterEach(){
		fct=null;
	}
 @Test
 void test() {
	 fail("Not yet implementes");
 }
 void additionTest() {
	 
	 assertEquals(10,fct.addition(2, 8));
 }
 void factorielTest() {
	 assertEquals(6, fct.factoriel(3));
	 }
}
