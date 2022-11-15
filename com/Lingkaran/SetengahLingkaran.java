
package com.lingkaran;


public class SetengahLingkaran implements Lingkaran{
    double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }
    
    @Override
    public void Luas() {
        double luas1 = (PANJANG / 2 * LEBAR) - (Math.PI * (PANJANG / 2) * (PANJANG / 2) / 4);
        hasil = 2 * luas1;
    }
    
    @Override
    public void Hasil() {
        System.out.println("Luasnya adalah : " + this.getHasil());
    }
    
    public double getHasil(){
        return hasil;
    }

    
}
