
package com.lingkaran;

public class LuasSetengah {
    private Lingkaran lingkaran;
    
    public LuasSetengah(Lingkaran lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public void HitungLuas(){
        this.lingkaran.Luas();
                
    }
    
    public void TampilkanHasil(){
        this.lingkaran.Hasil();
    }
}