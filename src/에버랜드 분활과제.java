package hello;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class �����������1 {
	
	public static int date1 = 0;
	public static String ticket = null, adult = null, passwd = null;
	public static String preferential = null;
	public static String b = null;
	public static int pay = 0, count = 0, sale = 0, age = 0, inputPreferential = 0, totalPay = 0;
	public static String YN = null;
	public static SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	public static String today = format.format(new Date());
	public static int thisYear = Integer.parseInt(today.substring(0,4));
	public static int thisMonth = Integer.parseInt(today.substring(4,6));
	public static int thisDay = Integer.parseInt(today.substring(6,8));
	public static int year = 0;
	public static int month = 0;
	public static int day = 0;
	
	public static ArrayList<String> arrTicket = new ArrayList<String>();
	public static ArrayList<String> arrAdult = new ArrayList<String>();
	public static ArrayList<String> arrB = new ArrayList<String>();
	public static ArrayList<Integer> arrCount = new ArrayList<Integer>();
	public static ArrayList<Integer> arrPay = new ArrayList<Integer>();
	public static ArrayList<String> arrPreferential = new ArrayList<String>();
	
	
	
	static Scanner myInput = new Scanner(System.in);
	public static void ticketPay() {
		if (ticket == "A") {
		    pay = pay + 60000;
		}else if (ticket == "B") {
			pay = pay + 56000;
		}else {
			pay = pay + 50000;
		}
			System.out.println(ticket);
	}
	public static void inputCount() {
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? ");
		count = myInput.nextInt();
	}
	public static void inputPasswd() {
		System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ��� \n");
        passwd = myInput.next();
       
		int year = Integer.parseInt(passwd.substring(0,2));
        int month = Integer.parseInt(passwd.substring(2,4));
        int day = Integer.parseInt(passwd.substring(4,6));
		
        if (month <= 12 && day <= 31) {
		} else {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}
	public static void inputAge() {
		if(year > 21) {
	    	year = 1900+year;
	    }
	    else if (year <= 21) {
	    	year = 2000 + year;
	    }
	    age = thisYear - year;
	    
	    if(month > thisMonth) {
	    	age = age-1;
	    }else if (month == thisMonth) {
	    	if (day > thisDay) {
	    		age = age-1;
	    	}
	    }
    
	    if (age < 3) {
	    	adult = "����";
	    }else if (age >= 3 && age < 13) {
	    	adult = "����/���";
	    }else {
	    	adult = "����/û�ҳ�";
	    }
	}
	public static void inputTicket() {
		if(ticket == "A") {
	    	if(adult == "����") {
	    		pay = 0;
	    	}else if (adult == "����/���") {
	    		pay = 48000;
	    	}else if (adult == "����/û�ҳ�") {
	    		pay = 60000;
	    	}
	    }
    
	    else if (ticket == "B") {
	    	if (adult == "����") {
	    	    pay = 0;
	    	} else if (adult == "����/���") {
	    		pay = 44000;
	    	} else if (adult == "����/û�ҳ�") {
	    		pay = 56000;
	    	}
	    }
	    
	    else if(ticket == "C") {
	    	if(adult == "����") {
	    		pay = 0;
	    	} else if (adult == "����/���") {
	    		pay = 40000;
	    	} else if (adult == "����/û�ҳ�") {
	    		pay = 50000;
	    	}
	    }
	}
	public static void inputPreferential() {
		System.out.print("�������� �����ϼ��� \n(1.���� 2.����� 3.���������� 4.���ڳ� 5.�ӻ��) : ");
		inputPreferential = myInput.nextInt();
		
	    switch(inputPreferential) {
		case 1: preferential = "�����׾���"; break;
		case 2: preferential = "�����"; break;
		case 3: preferential = "����������"; break;
		case 4: preferential = "���ڳ�"; break;
		case 5: preferential = "�ӻ��"; break;
		}
	}
	public static void clearAll() {
		arrTicket.clear();
		arrAdult.clear();
		arrCount.clear();
		arrPay.clear();
		arrB.clear();
	}
	public static void printDate() {
		Scanner myInput = new Scanner(System.in);
		System.out.print("��¥��? ");
		date1 = myInput.nextInt();
		do {
				
		if(date1 == 20210904 || date1 == 20210905 || date1 == 20210911 || date1 == 20210912 || date1 == 20210918 || date1 == 20210919
				 || date1 == 20210920 || date1 == 20210921 || date1 == 20210922 || date1 == 20210925 || date1 == 20210926 || date1 == 20211002
				 || date1 == 20211003 || date1 == 20211009 || date1 == 20211010 || date1 == 20211016 || date1 == 20211017 || date1 == 20211023
				 || date1 == 20211024 || date1 == 20211030 || date1 == 20211031 || date1 == 20211106 || date1 == 20211107) {
			ticket = "A";
				
		}else if(date1 == 20210601 || date1 == 20210602 || date1 == 20210603 || date1 == 20210604 || date1 == 20210605 || date1 == 20210606 || date1 == 20210607
				 || date1 == 20210608 || date1 == 20210609 || date1 == 20210610 || date1 == 20210611 || date1 == 20210612 || date1 == 20210613 || date1 == 20210619
				 || date1 == 20210620 || date1 == 20210626 || date1 == 20210627 || date1 == 20210703 || date1 == 20210704 || date1 == 20210710 || date1 == 20210711
				 || date1 == 20210717 || date1 == 20210718 || date1 == 20210724 || date1 == 20210725 || date1 == 20210729 || date1 == 20210730 || date1 == 20210731
				 || date1 == 20210801 || date1 == 20210802 || date1 == 20210803 || date1 == 20210807 || date1 == 20210808 || date1 == 20210814 || date1 == 20210815
				 || date1 == 20210821 || date1 == 20210822 || date1 == 20210828 || date1 == 20210829 || date1 == 20210903 || date1 == 20210906 || date1 == 20210907
				 || date1 == 20210908 || date1 == 20210909 || date1 == 20210910 || date1 == 20210913 || date1 == 20210914 || date1 == 20210915 || date1 == 20210916
				 || date1 == 20210917 || date1 == 20210923 || date1 == 20210924 || date1 == 20210927 || date1 == 20210928 || date1 == 20210929 || date1 == 20210930
				 || date1 == 20211001 || date1 == 20211004 || date1 == 20211005 || date1 == 20211006 || date1 == 20211007 || date1 == 20211008 || date1 == 20211011
				 || date1 == 20211012 || date1 == 20211013 || date1 == 20211014 || date1 == 20211015 || date1 == 20211018 || date1 == 20211019 || date1 == 20211020
				 || date1 == 20211021 || date1 == 20211022 || date1 == 20211025 || date1 == 20211026 || date1 == 20211027 || date1 == 20211028 || date1 == 20211029
				 || date1 == 20211101 || date1 == 20211102 || date1 == 20211103 || date1 == 20211104 || date1 == 20211105 || date1 == 20211108 || date1 == 20211109
				 || date1 == 20211110 || date1 == 20211111 || date1 == 20211112 || date1 == 20211113 || date1 == 20211114 || date1 == 20211120 || date1 == 20211121
				 || date1 == 20211127 || date1 == 20211128) {
			ticket = "B";
				
		}else if(date1 == 20210614 || date1 == 20210615 || date1 == 20210616 || date1 == 20210617 || date1 == 20210618 || date1 == 20210621 || date1 == 20210622
					 || date1 == 20210623 || date1 == 20210624 || date1 == 20210625 || date1 == 20210628 || date1 == 20210629 || date1 == 20210630 || date1 == 20210701
					 || date1 == 20210702 || date1 == 20210705 || date1 == 20210706 || date1 == 20210707 || date1 == 20210708 || date1 == 20210709 || date1 == 20210712
					 || date1 == 20210713 || date1 == 20210714 || date1 == 20210718 || date1 == 20210719 || date1 == 20210720 || date1 == 20210721 || date1 == 20210722
					 || date1 == 20210723 || date1 == 20210726 || date1 == 20210727 || date1 == 20210728 || date1 == 20210804 || date1 == 20210805 || date1 == 20210806
					 || date1 == 20210809 || date1 == 20210810 || date1 == 20210811 || date1 == 20210812 || date1 == 20210813 || date1 == 20210816 || date1 == 20210817
					 || date1 == 20210818 || date1 == 20210819 || date1 == 20210820 || date1 == 20210823 || date1 == 20210824 || date1 == 20210825 || date1 == 20210826
					 || date1 == 20210827 || date1 == 20210830 || date1 == 20210831 || date1 == 20210901 || date1 == 20210902 || date1 == 20211115 || date1 == 20211116
					 || date1 == 20211117 || date1 == 20211118 || date1 == 20211119 || date1 == 20211122 || date1 == 20211123 || date1 == 20211124 || date1 == 20211125
					 || date1 == 20211126 || date1 == 20211129 || date1 == 20211130) {
			ticket = "C";				
		
		}else {
			System.out.println("�ش���� ���� ��¥�Դϴ�."); 
		}
		}
	public static void addToarrayListAll() {
		Scanner myInput = new Scanner(System.in);
		ArrayList<String> arrTicket = new ArrayList<String>();
		ArrayList<String> arrAdult = new ArrayList<String>();
		ArrayList<String> arrB = new ArrayList<String>();
		ArrayList<Integer> arrCount = new ArrayList<Integer>();
		ArrayList<Integer> arrPay = new ArrayList<Integer>();
		ArrayList<String> arrPreferential = new ArrayList<String>();
		totalPay = count * pay;
		    arrTicket.add(ticket);
		    arrAdult.add(adult);
		    arrCount.add(count);
		    arrPay.add(pay);
		    arrPreferential.add(preferential);
		    arrB.add(b);
		    
		    
			System.out.println();
			System.out.printf("�� Ƽ�� ������ %d�� �Դϴ�.\n�����մϴ�.", pay*count);
		    System.out.println();
			System.out.print("================= �������� ==================\n");
			for (int i = 0; i < arrTicket.size(); i ++) 
			System.out.printf("%s %s  x%d��  %d  %s\n", arrTicket.get(i), arrAdult.get(i), arrCount.get(i),
					                                    arrPay.get(i)*arrCount.get(i), arrPreferential.get(i));
			System.out.print("===========================================\n");
			//
			System.out.println("�߰� �ֹ� Y, ���� N");
			YN = myInput.next();
			System.out.print(YN);
	}
	public static void main(String[] args) {

		myInput.close();

}
}
