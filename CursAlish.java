import java.util.Scanner;

public class CursAlish {
	
	public static void main(String[] args) {
		
		int v = 0;
		while(v<3) {
		System.out.println(" ");
		System.out.println("Hello " + v);
		v = v + 1;
		}
		
		int m = 1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter your num: ");
		int ch = sc1.nextInt();
		System.out.println("Enter your stepen: ");
		int st = sc1.nextInt();
		for (int i = 1; i <= st; i++) {
			m = m*ch;
			System.out.println(" ");
			System.out.println("Stepen "+i+" = "+m);
			
		}
		System.out.println(" ");
		System.out.println(ch + " in stepen " + st + " = " + m + " -- Your num in your stepen ");
		
		System.out.println(" ");
		if(ch>st) {
			System.out.println(" ");
			System.out.println("Allilluyyah!! Num bigger from stepen!! ");
		}
		else if (ch==st) {
			System.out.println(" ");
			System.out.println(" Oooops!! Num equal Stepeni!! ");
		}
		else {
			System.out.println(" ");
			System.out.println("Zrada!! Num menshe Stepen!!! ");
		}
		
		String str = new String("Dockole!!!");
		Scanner sc2 = new Scanner(System.in);
		System.out.println(str);
		System.out.println(" ");
		System.out.println("Enter something umnoe: ");
		String str1 = sc2.nextLine();
		System.out.println(" ");
		System.out.println("You enter very umnuyu frazu: " + str1 + "  " + str);
		System.out.println(" ");
		
		System.out.println("Enter num 22: ");
		int vv = sc1.nextInt();
		while(vv != 22) {
			System.out.println("Enter num 22, Skotyna: ");
			vv = sc1.nextInt();
		}
		System.out.println("Allilluiiya!!! You enter num 22 ");
		System.out.println(" ");
		
		int z;
		do {
			System.out.println("Enter num 22: ");
		    z = sc1.nextInt(); }
		while(z != 22);
		System.out.println("Allilluiiya!!! You enter num 22 ");
		System.out.println(" ");
		
		int bbb = 0;
		while(true) {
			if(bbb==210) {
			break;}
			System.out.println(bbb);
			bbb = bbb+10;
		}
		System.out.println("Allilluiiya!!! We get out from cycle!!! ");
		  System.out.println(" ");
		
		for(int i=0; i<=200;i+=10) {
			if(i%2==0){
			continue;}
		    System.out.println("The number:  " + i + " is nechetne!!! ");
		}
		  System.out.println(" ");
		  System.out.println(" Enter your fucking age: ");
		  int age = sc1.nextInt();
		  switch(age){
			case 0 :
			         System.out.println("You are born!!! MatherFucker!!! ");
					 break;
			case 7 :
                     System.out.println("You went to school!!! Suka!!! ");	
                     break;
			case 17 : 
                     System.out.println("You will go to ZSU!!! Skotina!!! ");			
		             break;
			default : 
		  System.out.println("You are tvar somebody!!! Fuck!!! ");	
		  }		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}