import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 에버랜드 {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
			Scanner myInput = new Scanner(System.in);
			int date1;
			String ticket = "", preferential = "", adult = "", passwd = null;
			int pay = 0, count, sale, age = 0, inputPreferential = 0, totalPay = 0;
			String YN = null;
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			String today = format.format(new Date());
			int thisYear = Integer.parseInt(today.substring(0,4));
			int thisMonth = Integer.parseInt(today.substring(4,6));
			int thisDay = Integer.parseInt(today.substring(6,8));
		
		do {
			System.out.print("날짜는? ");
			date1 = myInput.nextInt();
			
			
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
				System.out.println("해당되지 않은 날짜입니다.");
			    //continue;
			}

			if (ticket == "A") {
			    pay = pay + 60000;
			}else if (ticket == "B") {
				pay = pay + 56000;
			}else {
				pay = pay + 50000;
			}
				System.out.println(ticket);

		
			System.out.print("주민번호 앞자리를 입력하세요 \n");
            passwd = myInput.next();
           
    		int year = Integer.parseInt(passwd.substring(0,2));
            int month = Integer.parseInt(passwd.substring(2,4));
            int day = Integer.parseInt(passwd.substring(4,6));
			
            if (month <= 12 && day <= 31) {
			} else {
				System.out.println("다시 입력해주세요");
			}

			System.out.println("몇개를 주문하시겠습니까? ");
			count = myInput.nextInt();
			System.out.print("우대사항을 선택하세요 \n(1.없음 2.장애인 3.국가유공자 4.다자녀 5.임산부) : ");
			inputPreferential = myInput.nextInt();
			
		    switch(inputPreferential) {
			case 1: preferential = "우대사항없음"; break;
			case 2: preferential = "장애인"; break;
			case 3: preferential = "국가유공자"; break;
			case 4: preferential = "다자녀"; break;
			case 5: preferential = "임산부"; break;
			}
		    
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
		    	adult = "무료";
		    }else if (age >= 3 && age < 13) {
		    	adult = "소인/경로";
		    }else {
		    	adult = "대인/청소년";
		    }
		    
		    if(ticket == "A") {
		    	if(adult == "무료") {
		    		pay = 0;
		    	}else if (adult == "소인/경로") {
		    		pay = 48000;
		    	}else if (adult == "대인/청소년") {
		    		pay = 60000;
		    	}
		    }
	    
		    else if (ticket == "B") {
		    	if (adult == "무료") {
		    	    pay = 0;
		    	} else if (adult == "소인/경로") {
		    		pay = 44000;
		    	} else if (adult == "대인/청소년") {
		    		pay = 56000;
		    	}
		    }
		    
		    else if(ticket == "C") {
		    	if(adult == "무료") {
		    		pay = 0;
		    	} else if (adult == "소인/경로") {
		    		pay = 40000;
		    	} else if (adult == "대인/청소년") {
		    		pay = 50000;
		    	}
		    }
		 
		    totalPay = count * pay;
		    
			System.out.println();
			System.out.printf("총 티켓 가격은 %d원 입니다.\n감사합니다.", pay);
		    System.out.println();
			System.out.print("================= 에버랜드 ==================\n");
			System.out.printf("%s %s  x%d매  %d  %s\n", ticket, adult, count, totalPay, preferential);
			System.out.print("===========================================\n");
			//
			System.out.println("추가 주문 Y, 종료 N");
			YN = myInput.next();
			System.out.print(YN);
			
			if(YN.equals("y") || YN.equals("Y")) {
				continue;
			}else{
				System.out.println("PG 종료");
				break;
			}
			
		} while(true);
		myInput.close(); 
	 }
		
}

