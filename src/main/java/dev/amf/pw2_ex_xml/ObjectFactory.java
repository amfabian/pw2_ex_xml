
package dev.amf.pw2_ex_xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dev.amf.pw2_ex_xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConversaoMPHResponse_QNAME = new QName("http://pw2_ex_xml.amf.dev/", "conversaoMPHResponse");
    private final static QName _ConversaoNOS_QNAME = new QName("http://pw2_ex_xml.amf.dev/", "conversaoNOS");
    private final static QName _ConversaoNOSResponse_QNAME = new QName("http://pw2_ex_xml.amf.dev/", "conversaoNOSResponse");
    private final static QName _ConversaoMPH_QNAME = new QName("http://pw2_ex_xml.amf.dev/", "conversaoMPH");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dev.amf.pw2_ex_xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversaoNOSResponse }
     * 
     */
    public ConversaoNOSResponse createConversaoNOSResponse() {
        return new ConversaoNOSResponse();
    }

    /**
     * Create an instance of {@link ConversaoMPHResponse }
     * 
     */
    public ConversaoMPHResponse createConversaoMPHResponse() {
        return new ConversaoMPHResponse();
    }

    /**
     * Create an instance of {@link ConversaoNOS }
     * 
     */
    public ConversaoNOS createConversaoNOS() {
        return new ConversaoNOS();
    }

    /**
     * Create an instance of {@link ConversaoMPH }
     * 
     */
    public ConversaoMPH createConversaoMPH() {
        return new ConversaoMPH();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversaoMPHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pw2_ex_xml.amf.dev/", name = "conversaoMPHResponse")
    public JAXBElement<ConversaoMPHResponse> createConversaoMPHResponse(ConversaoMPHResponse value) {
        return new JAXBElement<ConversaoMPHResponse>(_ConversaoMPHResponse_QNAME, ConversaoMPHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversaoNOS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pw2_ex_xml.amf.dev/", name = "conversaoNOS")
    public JAXBElement<ConversaoNOS> createConversaoNOS(ConversaoNOS value) {
        return new JAXBElement<ConversaoNOS>(_ConversaoNOS_QNAME, ConversaoNOS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversaoNOSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pw2_ex_xml.amf.dev/", name = "conversaoNOSResponse")
    public JAXBElement<ConversaoNOSResponse> createConversaoNOSResponse(ConversaoNOSResponse value) {
        return new JAXBElement<ConversaoNOSResponse>(_ConversaoNOSResponse_QNAME, ConversaoNOSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversaoMPH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pw2_ex_xml.amf.dev/", name = "conversaoMPH")
    public JAXBElement<ConversaoMPH> createConversaoMPH(ConversaoMPH value) {
        return new JAXBElement<ConversaoMPH>(_ConversaoMPH_QNAME, ConversaoMPH.class, null, value);
    }

}
