
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

    private final static QName _Conversao_QNAME = new QName("http://pw2_ex_xml.amf.dev/", "conversao");
    private final static QName _ConversaoResponse_QNAME = new QName("http://pw2_ex_xml.amf.dev/", "conversaoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dev.amf.pw2_ex_xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conversao }
     * 
     */
    public Conversao createConversao() {
        return new Conversao();
    }

    /**
     * Create an instance of {@link ConversaoResponse }
     * 
     */
    public ConversaoResponse createConversaoResponse() {
        return new ConversaoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pw2_ex_xml.amf.dev/", name = "conversao")
    public JAXBElement<Conversao> createConversao(Conversao value) {
        return new JAXBElement<Conversao>(_Conversao_QNAME, Conversao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pw2_ex_xml.amf.dev/", name = "conversaoResponse")
    public JAXBElement<ConversaoResponse> createConversaoResponse(ConversaoResponse value) {
        return new JAXBElement<ConversaoResponse>(_ConversaoResponse_QNAME, ConversaoResponse.class, null, value);
    }

}
