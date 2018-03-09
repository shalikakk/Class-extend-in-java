package javaapplication4;
class Bank{  
int getRateOfInterest(){
	return 0;
	}  
}  
  
class SBI extends Bank{  
int getRateOfInterest(){
	return 8;
	}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){
	return 7;
	}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){
	return 9;
	}  
}  
  
 class Class_Extend {
public static void main(String args[]){  
Bank bank1=new SBI();  
Bank bank2=new ICICI();  
Bank bank3=new AXIS();  
System.out.println("SBI Rate of Interest: "+bank1.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+bank2.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+bank3.getRateOfInterest());  
}  
}  
    


