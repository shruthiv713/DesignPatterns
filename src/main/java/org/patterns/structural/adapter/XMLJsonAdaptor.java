package org.patterns.structural.adapter;

public class XMLJsonAdaptor implements WebRequestor{
    ThirdPartyJsonParser thirdPartyJsonParser;
    public XMLJsonAdaptor(ThirdPartyJsonParser thirdPartyJsonParser) {
        this.thirdPartyJsonParser = thirdPartyJsonParser;
    }

    @Override
    public String getEmployeesAsXML() {
        String jsonData = thirdPartyJsonParser.getEmployeesAsJson();

        // Simulate the complex conversion from JSON to XML.
        // In a real scenario, you'd use a JSON/XML library (like Jackson, JAXB, etc.)
        // to handle this conversion robustly.
        System.out.println("Adapter converting JSON to XML...");

        // A very basic manual conversion for demonstration.
        String xmlData = "<employees>\n";
        // This part would be more complex and parse the JSON.
        // For simplicity, we just use a placeholder.
        xmlData += "  <employee id=\"1\">\n";
        xmlData += "    <name>John Doe</name>\n";
        xmlData += "    <email>john.doe@example.com</email>\n";
        xmlData += "  </employee>\n";
        xmlData += "  <employee id=\"2\">\n";
        xmlData += "    <name>Jane Smith</name>\n";
        xmlData += "    <email>jane.smith@example.com</email>\n";
        xmlData += "  </employee>\n";
        xmlData += "</employees>";

        return xmlData;
    }
}
