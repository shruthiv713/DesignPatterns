package org.patterns.structural.adapter.client;

import org.patterns.structural.adapter.WebRequestor;

public class WebClient {
    WebRequestor webRequestor;
    public WebClient(WebRequestor webRequestor) {
        this.webRequestor = webRequestor;
    }
    public void displayEmployees() {
        System.out.println("Client is requesting employee data...");
        String employeesXml = webRequestor.getEmployeesAsXML();
        System.out.println("Client received and is processing XML data:\n" + employeesXml);
    }
}
