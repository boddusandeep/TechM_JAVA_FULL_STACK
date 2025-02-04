package Travel;
import Travel.TravelAgencies;
import java.util.Scanner;
//## Problem Statement
//
//Create a class TravelAgencies with below attributes:\
//regNo – int\
//agencyName – String\
//pakageType – String\
//price – int\
//flightFacility – boolean
//
//Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.
//
//Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and agencyDetailsforGivenIdAndType in Solution class.
//
//**findAgencyWithHighestPackagePrice method:**
//
//This method will take array of TravelAgencies objects as an input parameter and return the highest package price from the given array of objects.
//
//**agencyDetailsForGivenldAndType method:**
//
//This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String parameter packageType. The method will return the TravelAgencies object based on below conditions.
//
//1. FlightFacility should be available.
//2. The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
//
//If any of the above conditions are not met, then the method should return null.
//Note : Same Travel agency can have more than one package type. Travel agency and package type combination is unique. All the searches should be case insensitive.
//
//The above mentioned static methods should be called from the main method.
//
//For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is.
//For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned object.The AgencyName and price should be concatinated with : while printing.
//
//## Input
//
//    123
//    A2Z Agency
//    Platinum
//    50000
//    true
//    345
//    SSS Agency
//    Gold
//    30000
//    false
//    987
//    Cox and Kings
//    Diamond
//    40000
//    true
//    888
//    Global Tours
//    Silver
//    20000
//    false
//    987
//    Diamond
//
//## Output
//
//    50000
//    Cox and Kings:40000

public class Solution {
 
	public  static int  findAgencyWithHighestPackagePrice(TravelAgencies [] agency) {
		 int max=0;
		 for(TravelAgencies i:agency) {
			 if(i.price>max) {
				 max=i.price;
			 }
		 }
		 return max;
	}
	public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies [] agency,int regno,String packagetype) {
		for(TravelAgencies i:agency) {
			if(i.filght &&(i.regno==regno && i.packagetype==packagetype)) {
				return i;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TravelAgencies [] ta=new TravelAgencies[2];
		for(int i=0;i<4;i++) {
			    int regno = sc.nextInt();
	            String agencyname = sc.next();
	            String packagetype = sc.next();
	            int price = sc.nextInt();
	            boolean flight=sc.nextBoolean();
	            ta[i]=new TravelAgencies(regno,agencyname,packagetype,price,flight);
		}
		int regNoToFind = sc.nextInt();
        String packageTypeToFind = sc.nextLine();
       int hs=findAgencyWithHighestPackagePrice(ta);
       TravelAgencies res=agencyDetailsForGivenldAndType(ta,regNoToFind,packageTypeToFind);
       System.out.println(hs);
       System.out.println(res);
       
	}
 }