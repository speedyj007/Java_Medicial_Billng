/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PharmEasy;

public class User {

private int id;    
private String Name;
private String MFR_MKT;
private String HSN_Code;
private String Quantity;
private String Batch_No;
private String Exp_date;
private String MRP;
private String Discount;
private String GST;
private String Amount;


public User(int id, String Name, String MFR_MKT, String HSN_Code, String Quantity,String Batch_No,String Exp_date,String MRP, String Discount, String GST, String Amount )
{
    this.id = id;
    this.Name = Name;
    this.MFR_MKT = MFR_MKT;
    this.HSN_Code = HSN_Code;
    this.Quantity = Quantity;
    this.Batch_No = Batch_No;
    this.Exp_date = Exp_date;
    this.MRP = MRP;
    this.Discount = Discount;
    this.GST = GST;
    this.Amount = Amount;
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMFR_MKT() {
        return MFR_MKT;
    }

    public void setMFR_MKT(String MFR_MKT) {
        this.MFR_MKT = MFR_MKT;
    }

    public String getHSN_Code() {
        return HSN_Code;
    }

    public void setHSN_Code(String HSN_Code) {
        this.HSN_Code = HSN_Code;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getBatch_No() {
        return Batch_No;
    }

    public void setBatch_No(String Batch_No) {
        this.Batch_No = Batch_No;
    }

    public String getExp_date() {
        return Exp_date;
    }

    public void setExp_date(String Exp_date) {
        this.Exp_date = Exp_date;
    }

    public String getMRP() {
        return MRP;
    }

    public void setMRP(String MRP) {
        this.MRP = MRP;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    public String getGST() {
        return GST;
    }

    public void setGST(String GST) {
        this.GST = GST;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }


    
}
