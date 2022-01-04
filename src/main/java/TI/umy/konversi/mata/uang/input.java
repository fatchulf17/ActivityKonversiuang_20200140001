/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI.umy.konversi.mata.uang;

/**
 *
 * @author lenovo
 */ 

public class input { 
public double getUSDIDR(double usd)
{ 
        
        double idr = usd*14225; 
        return idr; 
    }
    
    public double getRMIDR(double rm)
    { 
        
        double idr = rm*3428.18; 
        return idr; 
    }
    
    public double getUSDRM(double usd)
    { 
        
        double rm = usd*0.24; 
        return rm;
    }
    
    public double getSGDIDR(double sgd)
    { 
        
        double idr = sgd*10569.57;
        
        return idr;
    }
    
    public String tampilsemuakonversi()
    { 
        double usdidr = getUSDIDR(8);
        double rmidr = getRMIDR(8);
        double usdrm = getUSDRM(8);
        double sgdidr = getSGDIDR(8);
        
        double tampilkanusdidr = usdidr;
        String tampilusdidr = Double.toString(tampilkanusdidr);
        double tampilkanrmidr = rmidr;
        String tampilrmidr = Double.toString(tampilkanrmidr);
        double tampilkanusdrm = usdrm;
        String tampilusdrm = Double.toString(tampilkanusdrm);
        double tampilkansgdidr = sgdidr;
        String tampilsgdidr = Double.toString(tampilkansgdidr);
        
        String tampil;
        tampil = "Hasil konversi dari Dollar Amerika ke Rupiah = Rp" + tampilusdidr + "<br>"
                + "Hasil konversi dari Ringgit ke Rupiah = Rp" + tampilrmidr + "<br>"
                + "Hasil konversi dari Dollar Amerika ke Ringgit = Rm" + tampilusdrm + "<br>"
                + "Hasil konversi dari Dollar Singapura ke Rupiah = Rp" + tampilsgdidr;
        return tampil;
    }
}