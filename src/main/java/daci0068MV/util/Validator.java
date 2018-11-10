package daci0068MV.util;

import daci0068MV.model.Carte;

public class Validator {

    // functie booleana care verifica daca stringul trimis ca parametru contine numai litere din alfabetul englez
	public static boolean isStringOK(String s) throws Exception{
		boolean flag = s.matches("[a-zA-Z ]+");
		if(!flag)
			throw new Exception("String invalid");
		return flag;
	}

	// valideaza structura interna a cartii c trimisa ca parametru
	public static void validateCarte(Carte c)throws Exception{
		if(c.getCuvinteCheie()==null){ //if(c.getCuvinteCheie()==null){
			throw new Exception("Lista cuvinte cheie vida!");
		}
		if(c.getAutori()==null){
			throw new Exception("Lista autori vida!");
		}
		if(!isStringOK(c.getTitlu()))
			throw new Exception("Titlu invalid!");
		for(String s:c.getAutori()){
			if(!isStringOK(s))
				throw new Exception("Autor invalid!");
		}
		for(String s:c.getCuvinteCheie()){
			if(!isStringOK(s))
				throw new Exception("Cuvant cheie invalid!");
		}
		if(!isNumber(c.getAnAparitie()))
			throw new Exception("An aparitie invalid!");
		if(c.getTitlu().length() > 50 || c.getTitlu().length() < 1){
			throw new Exception("Lungimea titlului este mai mare decat 50 caractere sau mai mica decat 1!");
		}
		if(c.getEditura().length() > 20 || c.getEditura().length() < 1) {
			throw new Exception("Lungimea editurii mai mica decat 1 sau mai mare decat 20 caractere!");
		}
	}

	// functie booleana care verifica daca stringul trimis ca parametru contine numai cifre
	public static boolean isNumber(String s){
		return s.matches("[0-9]+");
	}
//
//	public static boolean isOKString(String s){
//		String []t = s.split(" ");
//		if(t.length==2){
//			boolean ok1 = t[0].matches("[a-zA-Z]+");
//			boolean ok2 = t[1].matches("[a-zA-Z]+");
//			if(ok1==ok2 && ok1==true){
//				return true;
//			}
//			return false;
//		}
//		return s.matches("[a-zA-Z]+");
//	}
	
}
