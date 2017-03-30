package com.mgm.efooddemo.camel.activemq;

import java.io.FileInputStream;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Test;

public class TransformationTest extends CamelBlueprintTestSupport {
    
    @EndpointInject(uri = "mock:json_idoc_purchaseOrder-test-output")
    private MockEndpoint resultEndpoint;
    
    @Produce(uri = "direct:json_idoc_purchaseOrder-test-input")
    private ProducerTemplate startEndpoint;
    
    @Test
    public void transform() throws Exception {
    	 // setup expectations
        resultEndpoint.expectedMessageCount(1);

        // grab the expected result
        //String result = readFile("src/data/xyz-order.xml");
        
        // scrub the hard return/line feeds for actual generated results
        //result = result.replaceAll("[\r\n]+", "\n");
        
        //resultEndpoint.expectedBodiesReceived(result);

        // run test
        startEndpoint.sendBodyAndHeader(readFile("src/main/resources/data/order-request.json"), "approval", "AUTO");
        
        // verify results
        //resultEndpoint.assertIsSatisfied();
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from("direct:json_idoc_purchaseOrder-test-input")
                    .log("Before transformation:\n ${body}")
                    .to("ref:json_idoc_purchaseOrder")
                    .log("After transformation:\n ${body}")
                    .to("mock:json_idoc_purchaseOrder-test-output");
            }
        };
    }
    
	@Override
	protected String getBlueprintDescriptor() {
		return "OSGI-INF/blueprint/camel-blueprint.xml";
	}
    
    private String readFile(String filePath) throws Exception {
        String content;
        FileInputStream fis = new FileInputStream(filePath);
        try {
             content = createCamelContext().getTypeConverter().convertTo(String.class, fis);
        } finally {
            fis.close();
        }
        return content;
    }
    
    
   
}
