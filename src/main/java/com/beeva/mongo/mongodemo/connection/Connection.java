package com.beeva.mongo.mongodemo.connection;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Connection {
	public int puerto;
	public String host;
	
	public Connection(int puerto,String host){
		this.puerto=puerto;
		this.host=host;
		
	}
	
	public void Conectate(){

		try {
			MongoClient mongo= new MongoClient(host,puerto);
	    	DB db= mongo.getDB("testdb");
	    	DBCollection table = db.getCollection("user");
	    	BasicDBObject document = new BasicDBObject();
	    	document.put("nombre","ahmed");
	    	document.put("edad",22);
	    	table.insert(document);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
	}

}
