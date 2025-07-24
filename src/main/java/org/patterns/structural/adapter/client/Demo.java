package org.patterns.structural.adapter.client;

import org.patterns.structural.adapter.ThirdPartyJsonParser;
import org.patterns.structural.adapter.WebRequestor;
import org.patterns.structural.adapter.XMLJsonAdaptor;

public class Demo {
    public static void main(String[] args) {
        ThirdPartyJsonParser jsonParser = new ThirdPartyJsonParser();
        WebRequestor webRequestor = new XMLJsonAdaptor(jsonParser);
        WebClient webClient = new WebClient(webRequestor);
        webClient.displayEmployees();
    }
}
