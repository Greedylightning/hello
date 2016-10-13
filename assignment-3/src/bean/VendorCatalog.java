/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;

/**
 *
 * @author zack
 */
public class VendorCatalog {
    private ArrayList<Vendor> vendorCatalog;

    public VendorCatalog() {
        this.vendorCatalog = new ArrayList<>();
    }

    public ArrayList<Vendor> getVendorCatalog() {
        return vendorCatalog;
    }

    public void setVendorCatalog(ArrayList<Vendor> vendorCatalog) {
        this.vendorCatalog = vendorCatalog;
    }
    
    public Vendor addVendor(){
        Vendor vendor = new Vendor();
        vendorCatalog.add(vendor);
        return vendor;
    }
    
    public void deleteVendor(Vendor vendor){
        vendorCatalog.remove(vendor);
    }
    
}
