/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction_and_occurence_pattern;

import java.util.ArrayList;

public class dizi {
    
    //abstraction classı içinde bolum classına birden fazla erişim sağlanacağı için arraylist yapısı kullandık
    String adi;
    String yapimci;
    
    ArrayList<bolum>bolumler=new ArrayList<bolum>();
    //bir dizinin birden fazla bölümü olsbilir
    
    public void bolumEkle(bolum b){
       bolumler.add(b);
    }
    
    
}
