package dev.amf.pw2_ex_xml;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "Big", serviceName = "Big")
public class MyBigWS {

    @WebMethod
    public double conversaoMPH(double a){
        a = a*0.621371;
      //  System.out.println("Conversão de km/h para mph: " + a);
        return a;
    }
    
    @WebMethod
    public double conversaoNOS(double b){
        b = b*1.852;
       // System.out.println("Conversão de nos para km/h: " + a);
        return b;
    }
    
}
