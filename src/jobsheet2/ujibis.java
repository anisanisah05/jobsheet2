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
public class ujibis {
    public static void main(String[]args){
        int password;
 bis bisBesar = new bis(40);
 bisBesar.cetak();
 
 bisBesar.getPenumpang(123);
 bisBesar.cetak();
 
 bisBesar.getPenumpang(121);
 bisBesar.cetak();
 
 bisBesar.getPenumpang(123);
 bisBesar.cetak();
 
 System.out.println("rata-rata penumpang : "+bisBesar.getAverage());
    }
}
