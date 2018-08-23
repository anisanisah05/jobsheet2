/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author NISAH~05
 */
public class Bus4 {
     public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru;
    public Bus4(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(double penumpang)
    {
        double temp;
        temp = this.penumpang+penumpang;
        if (temp> maxpenumpang){
            System.out.println("penumpang melebihi kuota");
            
        }
        else
        {
            this.penumpang=temp;
        }
    }
    public void getpenumpang(double password)
    {       if (password==24)
    {
        System.out.println("password benar");
    }
    else
    {
        System.out.println("password salah");
    }
}
    public void getAverage(double average)
    {       if (counter==24)
    {
        System.out.println("password benar");
    }
    else
    {
        System.out.println("password salah");
    }
}
public void cetakpenumpang()
{
System.out.println("penumpang bus sekarang = "+penumpang);
System.out.println("maksimum penumpang yang seharusnya adalah = "+ maxpenumpang);
}
}
