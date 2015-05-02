package org.gradle.service;

import java.util.List;
import org.gradle.model.Document;
import org.gradle.model.Type;

public interface ISearchEngine {
	
	public List<Document> findByType(Type documentType);
	public List<Document> listAll();
}
