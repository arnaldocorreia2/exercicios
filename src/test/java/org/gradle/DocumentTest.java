package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;


import java.util.List;


import org.gradle.model.Document;
import org.gradle.model.Type;
import  org.gradle.service.ISearchEngine;
import org.gradle.service.SearchEngine;
public class DocumentTest {

	
	
	private ISearchEngine engine = new SearchEngine();
	 
	@Test
	public void testFindByType() {
			Type documentType = new Type();
			documentType.setName("PDF");
			documentType.setDesc("Portable Document Format");
			documentType.setExtension(".pdf");
	 
			List<Document> documents = engine.findByType(documentType);
			assertNotNull(documents);
			assertTrue(documents.size() == 1);
			assertEquals(documentType.getName(),
			documents.get(0).getType().getName());
			assertEquals(documentType.getDesc(),
			documents.get(0).getType().getDesc());
			assertEquals(documentType.getExtension(),
			documents.get(0).getType().getExtension());
	}
	 
	@Test
	public void testListAll() {
			List<Document> documents = engine.listAll();
			assertNotNull(documents);
			assertTrue(documents.size() == 1);
	}

}
