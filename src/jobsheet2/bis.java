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
public class bis {
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    public bis(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else{this.penumpang = temp;
        counter++;
        }
    }
    public void getPenumpang(double password){
        if (password==123){
            System.out.println("\nPassword benar");
            addPenumpang(15);
        }
        else{
            System.out.println("\n Password salah!!!");
        }
    }
    public double getAverage(){
        return penumpang/counter;
    }
    public void cetak(){
        System.out.println("penumpang bus sekarang adalah"+ penumpang);
        System.out.println("penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
