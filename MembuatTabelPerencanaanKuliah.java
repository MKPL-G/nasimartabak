/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package membuattabelperencanaankuliah;

import java.util.Scanner;

/**
 *
 * @author Gitta
 */
public class MembuatTabelPerencanaanKuliah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai, jmlSks, menu;
        long nim;
        String  matKul;
        System.out.print("NIM : ");
        nim = in.nextInt();
        System.out.print("Nama : ");
        String nama = in.nextLine();
        System.out.print("Mata Kuliah : ");
        matKul = in.nextLine();
        System.out.print("Jumlah SKS : ");
        jmlSks = in.nextInt();
        System.out.print("Nilai : ");
        nilai = in.nextInt();
        menu = in.nextInt();
        switch (menu){
            case 1:
                System.out.println("Pemrograman Dasar");
                System.out.println("Jumlah SKS : ");
                System.out.println("Nilai : ");
                break;
            case 2:
                System.out.println("Sistem Digital");
                System.out.println("Jumlah SKS : ");
                System.out.println("Nilai : ");
                break;
            case 3:
                System.out.println("Matematika Komputasi");
                System.out.println("Jumlah SKS : ");
                System.out.println("Nilai : ");
                break;
            case 4:
                System.out.println("PTIIK");
                System.out.println("Jumlah SKS : ");
                System.out.println("Nilai : ");
                break;
                
        }
        
                
                
                
    }
    }
        




    

