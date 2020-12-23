package by.mk.mvnex.electronics_factory.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

public class ApplianceReader implements ApplianceCommonReader {
	private List<String> file;
	
	public List<String> takeAll(){
		readApplianceFile();
		return file;
	}

	@Override
	public void readApplianceFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("resources/appliances_db.txt"));
			Iterator<String> iterator = file.iterator();
			file.add(reader.readLine());
			while(iterator.hasNext()) {
				file.add(reader.readLine());
	    	}
	     	reader.close();
		}	catch(Exception e) {
		file = null;
		}
	}
}
