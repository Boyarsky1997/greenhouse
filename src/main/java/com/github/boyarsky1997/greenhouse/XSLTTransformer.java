package com.github.boyarsky1997.greenhouse;

import javax.xml.transform.*;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

class XsltTransform {
    public static void main(String[] args) throws TransformerException {
        Source xslt = new StreamSource(new File("src\\main\\resources\\greenhouse.xsl"));
        Source xml  = new StreamSource(new File("src\\main\\resources\\greenhouse.xml"));
        Result out  = new StreamResult(new File("src\\main\\resources\\greenhouse.html"));

        TransformerFactory factory = TransformerFactory.newInstance();
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

        Transformer transformer = factory.newTransformer(xslt);
        transformer.transform(xml, out);
    }
}