package xieru;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class wendang {

	public static void main( String args[] ){
	      try{   
	         MongoClient mongoClient = new MongoClient( "localhost" , 8081 );
	         MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");  
	         System.out.println("Connect to database successfully");
	         MongoCollection<Document> collection = mongoDatabase.getCollection("test");
	         Document document = new Document("title", "MongoDB").  
	         append("description", "database").  
	         append("likes", 100).  
	         append("by", "Fly");  
	         List<Document> documents = new ArrayList<Document>();  
	         documents.add(document);  
	         collection.insertMany(documents);   
	      }catch(Exception e){
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      }
	   }
	
	
}
