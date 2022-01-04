/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI.umy.konversi.mata.uang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lenovo
 */
@Controller
@ResponseBody
public class KonversiController {
    
    input hitung = new input();
    
    @RequestMapping("/konversiusdtoidr")
    public String tampilusdtoidr(){ 
        
        double idr = hitung.getUSDIDR(8); 
        
        String view = "Hasil konversi 5 USD ke IDR = " + idr + " Rupiah.";
        
        return view; 
    }
        
    @RequestMapping("/konversirmtoidr") 
    public String tampilrmtoidr(){ 
        
        double idr = hitung.getRMIDR(8);
        
        String view = "Hasil konversi 5 RM ke IDR = " + idr + " Rupiah.";
        
        return view; 
    }
    
    @RequestMapping("/konversiusdtorm") 
    public String tampilusdtorm()
    { 
        
        double rm = hitung.getUSDRM(8); 
        
        String view = "Hasil konversi 5 USD ke RM = " + rm + " Ringgit.";
        
        return view; 
    }
    
    @RequestMapping("/konversisgdtoidr") 
    public String tampilsgdtoidr()
    { 
        
        double sgd = hitung.getSGDIDR(8); 
        
        String view = "Hasil konversi 5 SGD ke IDR = " + sgd + " Rupiah.";
        
        return view;
    }
    @RequestMapping("/konversisemuakurs")
    public String konversisemuakurs()
    { 
        String tampilkan;
        tampilkan = hitung.tampilsemuakonversi();
        return tampilkan;
    }
}