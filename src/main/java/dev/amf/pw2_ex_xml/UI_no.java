package dev.amf.pw2_ex_xml;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet("/nos")
public class UI_no extends HttpServlet {
    
     @WebServiceRef(wsdlLocation = "http://localhost:9080/Big?wsdl")
     private Big_Service service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Big port = service.getBigPort();
        System.out.println("Conversão de nós para km/h " + port.conversaoNOS(10));
     }
    
}
