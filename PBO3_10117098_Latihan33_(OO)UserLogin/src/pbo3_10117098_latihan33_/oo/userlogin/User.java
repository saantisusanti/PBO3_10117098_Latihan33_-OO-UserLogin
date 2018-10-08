/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan33_.oo.userlogin;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program yang menampilkan form login
 *                     dengan username dan password yang di input oleh user
 */
public class User {
     private  String userName;
     private  String password;
     public Boolean statusAkun;
     
     private boolean cekAkun (String parUsername,String parPassword){
        userName = "Saantisusanti";
        password = "sotus";
        statusAkun = parPassword.equals(password) && parUsername.equals
        (userName);
         return statusAkun;         
     }
     
     private void hasilLogin (Boolean parStatusAkun,String parUsername ){
      if (parStatusAkun==true) {
            System.out.println("\n******HALLO "+parUsername.toUpperCase()
                    +"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOops, Username atau Password Anda Salah");
        }   
     }
      public void pengecekkanLogin (String parUsername,String parPassword){
         cekAkun(parUsername,parPassword);
        hasilLogin(statusAkun,parUsername);
     }
}
