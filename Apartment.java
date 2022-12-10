// This is two files under the squigly lines is the second file.
// Programmer: Isaac Guzman
// Program Name: ACMEPay.java
// Date: 12/08/2022
// Version: 1.0
// This program takes the user's criteria for an apartment and finds which apartments
// fit their criteria and the ones that are close and tells the user what is wrong with them. 


package Apartment;

public class Apartment
{
    private int number;
    private int bedrooms;
    private int baths;
    private int rent;

    public Apartment(int nbr, int bdrm, int bth, int rnt)
    {
        number = nbr;
        bedrooms = bdrm;
        baths = bth;
        rent = rnt;
    }

    public int getNbr()
    {
        return number;
    }
    public int getBdrm()
    {
        return bedrooms;
    }public int getBth()
    {
        return baths;
    }public int getRnt()
    {
        return rent;
    }
}





˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜






package Apartment;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class TestApartment
{
    public static void main(String[] args)
    {
        Apartment a = new Apartment(1, 2, 2, 2000);
        Apartment b = new Apartment(2, 3, 2, 2500);
        Apartment c = new Apartment(3, 1, 1, 1000);
        Apartment d = new Apartment(4, 3, 3, 3000);
        Apartment e = new Apartment(5, 1, 2, 1500);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter minimum number of bedrooms required");
            int bdrm = scan.nextInt();
        System.out.println("Enter minimum number of baths required");
            int bth = scan.nextInt();
        System.out.println("Enter maximum rent");
            int rnt = scan.nextInt();
        


            if(a.getBdrm()>=bdrm && a.getBth()>=bth && a.getRnt()<=rnt)
            {
                System.out.println("Apartment a fits your criteria exactly: Bedrooms: "+a.getBdrm()+ " Bathrooms: "+a.getBth()+" Rent: "+a.getRnt());
            }
            else if(a.getBdrm()>=bdrm && a.getBth()>=bth && a.getRnt()>rnt)
            {
                System.out.println("Apartment a fits your criteria but is out of your budget: Bedrooms: "+a.getBdrm()+ " Bathrooms: "+a.getBth()+" Rent: "+a.getRnt());
            }
            else if(a.getBdrm()<bdrm && a.getBth()>=bth && a.getRnt()<=rnt)
            {
                System.out.println("Apartment a fits your criteria but doesn't have enough bedrooms: Bedrooms: "+a.getBdrm()+ " Bathrooms: "+a.getBth()+" Rent: "+a.getRnt());
            }
            else if(a.getBdrm()>=bdrm && a.getBth()<bth && a.getRnt()<=rnt)
            {
                System.out.println("Apartment a fits your criteria but doesn't have enough bathrooms: Bedrooms: "+a.getBdrm()+ " Bathrooms: "+a.getBth()+" Rent: "+a.getRnt());
            }
            else if(a.getBdrm()<bdrm && a.getBth()<bth && a.getRnt()>rnt)
            {
                System.out.println("Apartment a does not fit your criteria");
            }


            if(b.getBdrm()>=bdrm && b.getBth()>=bth && b.getRnt()<=rnt)
            {
                System.out.println("Apartment b fits your criteria exactly: Bedrooms: "+b.getBdrm()+ " Bathrooms: "+b.getBth()+ " Rent: "+b.getRnt());
            }
            else if(b.getBdrm()>=bdrm && b.getBth()>=bth && b.getRnt()>rnt)
            {
                System.out.println("Apartment b fits your criteria but is out of your budget: Bedrooms: "+b.getBdrm()+ " Bathrooms: "+b.getBth()+ " Rent: "+b.getRnt());
            }
            else if(b.getBdrm()<bdrm && b.getBth()>=bth && b.getRnt()<=rnt)
            {
                System.out.println("Apartment b fits your criteria but doesn't have enough bedrooms: Bedrooms: "+b.getBdrm()+ " Bathrooms: "+b.getBth()+ " Rent: "+b.getRnt());
            }
            else if(b.getBdrm()>=bdrm && b.getBth()<bth && b.getRnt()<=rnt)
            {
                System.out.println("Apartment b fits your criteria but doesn't have enough bathrooms: Bedrooms: "+b.getBdrm()+ " Bathrooms: "+b.getBth()+ " Rent: "+b.getRnt());
            }
            else if(b.getBdrm()<bdrm && b.getBth()<bth && b.getRnt()>rnt)
            {
                System.out.println("Apartment b does not fit your criteria");
            }


            if(c.getBdrm()>=bdrm && c.getBth()>=bth && c.getRnt()<=rnt)
            {
                System.out.println("Apartment c fits your criteria exactly: Bedrooms: "+c.getBdrm()+" Bathrooms: "+c.getBth()+" Rent: "+c.getRnt());
            }
            else if(c.getBdrm()>=bdrm && c.getBth()>=bth && c.getRnt()>rnt)
            {
                System.out.println("Apartment c fits your criteria but is out of your budget: Bedrooms: "+c.getBdrm()+" Bathrooms: "+c.getBth()+" Rent: "+c.getRnt());
            }
            else if(c.getBdrm()<bdrm && c.getBth()>=bth && c.getRnt()<=rnt)
            {
                System.out.println("Apartment c fits your criteria but doesn't have enough bedrooms: Bedrooms: "+c.getBdrm()+" Bathrooms: "+c.getBth()+" Rent: "+c.getRnt());
            }
            else if(c.getBdrm()>=bdrm && c.getBth()<bth && c.getRnt()<=rnt)
            {
                System.out.println("Apartment c fits your criteria but doesn't have enough bathrooms: Bedrooms: "+c.getBdrm()+" Bathrooms: "+c.getBth()+" Rent: "+c.getRnt());
            }
            else if(c.getBdrm()<bdrm && c.getBth()<bth && c.getRnt()>rnt)
            {
                System.out.println("Apartment c does not fit your criteria");
            }


            if(d.getBdrm()>=bdrm && d.getBth()>=bth && d.getRnt()<=rnt)
            {
                System.out.println("Apartment d fits your criteria exactly: Bedrooms: "+d.getBdrm()+" Bathrooms: "+d.getBth()+" Rent: "+d.getRnt());
            }
            else if(d.getBdrm()>=bdrm && d.getBth()>=bth && d.getRnt()>rnt)
            {
                System.out.println("Apartment d fits your criteria but is out of your budget: Bedrooms: "+d.getBdrm()+" Bathrooms: "+d.getBth()+" Rent: "+d.getRnt());
            } 
            else if(d.getBdrm()<bdrm && d.getBth()>=bth && d.getRnt()<=rnt)
            {
                System.out.println("Apartment d fits your criteria but doesn't have enough bedrooms: Bedrooms: "+d.getBdrm()+" Bathrooms: "+d.getBth()+" Rent: "+d.getRnt());
            }
            else if(d.getBdrm()>=bdrm && d.getBth()<bth && d.getRnt()<=rnt)
            {
                System.out.println("Apartment d fits your criteria but doesn't have enough bathrooms: Bedrooms: "+d.getBdrm()+" Bathrooms: "+d.getBth()+" Rent: "+d.getRnt());
            }
            else if(d.getBdrm()<bdrm && d.getBth()<bth && d.getRnt()>rnt)
            {
                System.out.println("Apartment d does not fit your criteria");
            }


            if(e.getBdrm()>=bdrm && e.getBth()>=bth && e.getRnt()<=rnt)
            {
                System.out.println("Apartment e fits your criteria exactly: Bedrooms: "+e.getBdrm()+" Bathrooms: "+e.getBth()+" Rent: "+e.getRnt());
            }
            else if(e.getBdrm()>=bdrm && e.getBth()>=bth && e.getRnt()>rnt)
            {
                System.out.println("Apartment e fits your criteria but is out of your budget: Bedrooms: "+e.getBdrm()+" Bathrooms: "+e.getBth()+" Rent: "+e.getRnt());
            } 
            else if(e.getBdrm()<bdrm && e.getBth()>=bth && e.getRnt()<=rnt)
            {
                System.out.println("Apartment e fits your criteria but doesn't have enough bedrooms: Bedrooms: "+e.getBdrm()+" Bathrooms: "+e.getBth()+" Rent: "+e.getRnt());
            }
            else if(e.getBdrm()>=bdrm && e.getBth()<bth && e.getRnt()<=rnt)
            {
                System.out.println("Apartment e fits your criteria but doesn't have enough bathrooms: Bedrooms: "+e.getBdrm()+" Bathrooms: "+e.getBth()+" Rent: "+e.getRnt());
            }
            else if(e.getBdrm()<bdrm && e.getBth()<bth && e.getRnt()>rnt)
            {
                System.out.println("Apartment e does not fit your criteria");
            }
        
    }
}
