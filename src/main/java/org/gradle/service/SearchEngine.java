package org.gradle.service;

import java.util.ArrayList;
import java.util.List;

import org.gradle.model.Document;
import org.gradle.model.Type;

public class SearchEngine implements ISearchEngine {

	@Override
	public List<Document> findByType(Type documentType) {
		List<Document> result = new ArrayList<Document>();
		for(Document document : storage()){
		if(document.getType().getName()
		.equals(documentType.getName()))
			result.add(document);
		}
		return result;

	}

	private List<Document> storage() {
		
		// TODO Auto-generated method stub
		List<Document> result = new ArrayList<Document>();
		 
		Type type = new Type();
		type.setName("PDF");
		type.setDesc("Portable Document Format");
		type.setExtension(".pdf");
		 
		Document document = new Document();
		document.setName("Book Template");
		document.setType(type);
		document.setLocation("/Documents/Book Template.pdf");
		 
		result.add(document);
		 
		//More Types and Documents omitted
		 
		return result;

	}

	@Override
	public List<Document> listAll() {
		// TODO Auto-generated method stub
		return storage();
	}
	
	

}
