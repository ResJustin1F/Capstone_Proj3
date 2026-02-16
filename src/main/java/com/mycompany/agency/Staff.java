package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList

        staffList[0] = new Executive("Laila", "21 Jump Street", "(281) 826-3068" , "465-73-5022", 21400.5);
        staffList[1] = new StaffEmployee("Aaliyah" , "1177 Fortworth Drive", "(914) 632-1188", "559-81-1301", 520.12);
        staffList[2] = new Intern("Sabastian" , "23 Twig Lane", "(662) 420-7597");
        staffList[3] = new TempEmploee("Dylan", "Never Here Road", "(630) 759-0287", "505-88-5714", 622.0);
        staffList[4] = new TempEmploee("Venus" , "14 Galaxy Road","(641) 792-6316", "044-34-6954",150.0 );
        staffList[5] = new StaffEmployee("Jason" , "24 Twig Lane", "(407) 350-3114", "300-62-3266", 1669.23);

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
