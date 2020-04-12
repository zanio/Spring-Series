package com.example.demo.springApplicationContext;



public class XmlPersonDAO {
    XmlJdbcConnection xmlJdbcConnection;

//    public XmlPersonDAO(XmlJdbcConnection xmlJdbcConnection) {
//        this.xmlJdbcConnection = xmlJdbcConnection;
//    }

    public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = jdbcConnection;
    }

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }
}
