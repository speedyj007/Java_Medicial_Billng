/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netmeds_billing_record;







public class User {

private int id;    
private String name;
private String rate;
private String quantity;
private String discount;
private String total;


public User(int id, String name, String rate, String quantity, String discount, String total)
{
    this.id = id;
    this.name = name;
    this.rate = rate;
    this.quantity = quantity;
    this.discount = discount;
    this.total = total;
}



public int getid()
{
    return id;
}
public String getname(){
    return name;
}

public String getrate(){
    return rate;
}

public String getquantity(){
    return quantity;
}

public String getdiscount(){
    return discount;
}

public String gettotal(){
    return total;
}

    
    
    
    
}
