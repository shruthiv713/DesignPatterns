package org.patterns.structural.adapter;

public class ThirdPartyJsonParser {
    public String getEmployeesAsJson() {
        // In a real application, this would fetch from a service endpoint.
        // For this example, we'll return a hardcoded JSON string.
        return """
                [
                    {"id": 1, "name": "John Doe", "email": "john.doe@example.com"},
                    {"id": 2, "name": "Jane Smith", "email": "jane.smith@example.com"}
                ]
                """;
    }
}
