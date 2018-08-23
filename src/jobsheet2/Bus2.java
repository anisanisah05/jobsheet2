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
public class Bus2 {
    private int penumpang;
    private int maxPenumpang;
    public Bus2(int maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>=maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else{
            this.penumpang = temp;
        }
    }
public void cetak(){
System.out.println("penumpang bus sekarang adalah "+ penumpang);
System.out.println("penumpang maksimum seharusnya adalah "+ maxPenumpang);
}
}
