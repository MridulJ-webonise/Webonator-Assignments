import java.util.*;

interface mobile_phone{
    
    void sim();
    void camera();
    void OS();
    void phone_dial();
    void playStore();
    void paymentApp();
    void screen();
    void ram();
    void storage();
}

class Samsung implements mobile_phone{

    public void sim()
    {
        System.out.println("Dual Sim phone");
    }

    public void camera()
    {
        System.out.println("Rear : 64MP primary camera + 16MP Wide Angle \nFront : 16MP camera");
    }

    public void OS()
    {
        System.out.println("Runs on Android 10 with customisation and feature of OneUI.");
    }

    public void phone_dial()
    {
        System.out.println("Samsung dialer");
    }

    public void playStore()
    {
        System.out.println("Samsung Playstore");
    }

    public void paymentApp()
    {
        System.out.println("Samsung Pay");
    }

    public void screen()
    {
        System.out.println("6.8 inch Amoled Screen");
    }

    public void ram()
    {
        System.out.println("Available with 6Gb RAM");
    }

    public void storage()
    {
        System.out.println("Available with 128GB storage");
    }

    public void googleDrive()
    {
        System.out.println("Google drive offering 15Gb free storage.");
    }

    public void samsungHealth()
    {
        System.out.println("Measure your day to day calories burnt and Heartbeats");
    }

}


class Apple implements mobile_phone{

    public void sim()
    {
        System.out.println("Single Sim phone");
    }

    public void camera()
    {
        System.out.println("Rear : 12MP primary camera + 12MP Wide Angle \nFront : 12MP camera");
    }

    public void OS()
    {
        System.out.println("Runs on IOS 15.");
    }

    public void screen()
    {
        System.out.println("6.1 inch Super Retina OLED");
    }
    public void phone_dial()
    {
        System.out.println("Apple phone dialer");
    }

    public void playStore()
    {
        System.out.println("Apple Appstore");
    }

    public void paymentApp()
    {
        System.out.println("Apple iPay");
    }

    public void ram()
    {
        System.out.println("Available with 4Gb RAM");
    }

    public void storage()
    {
        System.out.println("Available with 128GB storage");
    }

    public void iCloud()
    {
        System.out.println("iCloud - storage for backup and syncing user data.");
    }

    public void iTunes()
    {
        System.out.println("Listen to all latest songs without downloading");
    }
}



public class phone
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Which brand's phone are you looking for ?\n 1.Samsung \t2.Apple");
        int n = s.nextInt();

        switch(n)
        {
            case 1: {
                        Samsung s20 = new Samsung();
                        System.out.println("Welcome to Samsung !\nChoose for further details : \n1.SIM \t2.Camera \t3.Operating System \t4.Screen \t");
                        System.out.println("5.Play Store \t6.Payment App \t7.RAM \t8.Storage \t9.Cloud Storage \t10.Health Apps");
                        
                        while(true)
                        {
                            int a = s.nextInt();
                            switch(a)
                            {
                                case 0: return;
                                case 1: s20.sim();break;
                                case 2: s20.camera();break;
                                case 3: s20.OS();break;
                                case 4: s20.screen();break;
                                case 5: s20.playStore();break;
                                case 6: s20.paymentApp();break;
                                case 7: s20.ram();break;
                                case 8: s20.storage();break;
                                case 9: s20.googleDrive();break;
                                case 10: s20.samsungHealth();break;
                            }
                        }
                    }
                
            case 2: {
                        Apple iphone12 = new Apple();
                        System.out.println("Welcome to Apple !\n Choose for further details : \n0.Exit \t1.SIM \t2.Camera \t3.Operating System \t4.Screen \t");
                        System.out.println("5.Play Store \t6.Payment App \t7.RAM \t8.Storage \t9.Cloud Storage \t10.Music Player");
                        while(true)
                        {
                            int a = s.nextInt();
                            switch(a)
                            {
                                case 0: return;
                                case 1: iphone12.sim();break;
                                case 2: iphone12.camera();break;
                                case 3: iphone12.OS();break;
                                case 4: iphone12.screen();break;
                                case 5: iphone12.playStore();break;
                                case 6: iphone12.paymentApp();break;
                                case 7: iphone12.ram();break;
                                case 8: iphone12.storage();break;
                                case 9: iphone12.iCloud();break;
                                case 10: iphone12.iTunes();break;
                            }
                        }
                    }
            default : System.out.println("Wrong input ! Try again.");
        }

    }
}