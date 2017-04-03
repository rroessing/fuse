package com.mgm.efooddemo.dozer;

import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.Test;

import generated_1490874398211.ORDERS05;
import orderrequest.OrderRequest;

public class DozerMappingTest {

	@Test
	public void test() throws JAXBException {
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.setMappingFiles(Arrays.asList("transformation.xml"));
		OrderRequest source = new OrderRequest();
		source.setGenerationID("super");
		source.setWarehouseCode("myWarehouse8080");


		ORDERS05 destObject = mapper.map(source, ORDERS05.class);
		JAXBContext jaxbContext = JAXBContext.newInstance(ORDERS05.class);
		
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(destObject, System.out);
	}
}
