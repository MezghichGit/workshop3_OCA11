package gestion_ecole.model;

import java.util.Date;
import java.util.Scanner;

public class Test {
	
	static boolean rechercheEleve(Eleve eleve, Eleve[]students)
	{
		boolean res = false;
		
		for(Eleve e : students)
		{
			if(e.equals(eleve))
				res = true;
		}
		
		return res;
	}

	public static void main(String[] args) {
		Eleve eleves[] = new Eleve[3];
		//System.out.println(eleves[0]);
		//Date d1 = new Date(2000,9,4);
		//System.out.println(d1);
		Eleve e1 = new Eleve("Mezghich", "Med Amine",25,new Date(2000,9,4),60,170,"tunis");
		Eleve e2 = new Eleve("AMBen Salah", "Ali",26,new Date(2001,7,14),65,175,"bardo");
		Eleve e3 = new Eleve("Ben Mrad", "Ayoub",24,new Date(1999,8,3),68,180,"TUNIS");
		eleves[0] = e1;
		eleves[1] = e2;
		eleves[2] = e3;
		//All
		for(Eleve e : eleves)
		{
			//System.out.println(e.toString());
			System.out.println(e);
		}
		
		System.out.println("******* Question 9.a *******");
		// Q9.a)
		for(Eleve e : eleves)
		{
			if(e.nom.startsWith("am") || e.nom.startsWith("AM"))
			{
				System.out.println(e);
			}
		}
		
		// Q9.b)
		System.out.println("******* Question 9.b *******");
			for(Eleve e : eleves)
			{
				//if(e.observation.toUpperCase().equals("TUNIS"))
				if(e.observation.contains("tunis") || e.observation.contains("TUNIS"))
				{
					System.out.println(e);
				}
			}
			
			// Q9.c)
			System.out.println("******* Question 9.c *******");
			/*for(Eleve e : eleves)
			{
				e.nom = e.nom.toUpperCase();
				e.prenom = e.prenom.toUpperCase();
				System.out.println(e);
			}*/
			
			// Q11)
			System.out.println("******* Question 11 *******");
			Eleve temp = new Eleve();
			
			System.out.println(temp);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Donner un nom");
			temp.nom = sc.nextLine();
			
			System.out.println("Donner un prenom");
			temp.prenom = sc.nextLine();
			
			System.out.println("Donner l'age");
			temp.age = sc.nextInt();
			
			System.out.println(temp);
			
			boolean exist = rechercheEleve(temp, eleves);
			if(exist==true)
				System.out.println("Eleve existe dans le tableau");
			else
				System.out.println("N'existe pas dans le tableau");

	}

}
