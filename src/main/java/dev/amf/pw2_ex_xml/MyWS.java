package dev.amf.pw2_ex_xml;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "Big", serviceName = "Big")
public class MyWS {

    @WebMethod
    public double conversao(double a){
        a = a*0.621371;
        System.out.println("Conversão de km/h para mph: " + a);
        return a;
    }
    
}
