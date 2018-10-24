package xieru;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class suoyouwd {

	public static void main( String args[] ){
	      try{   
	         MongoClient mongoClient = new MongoClient( "localhost" , 8081 );
	         MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");  
	         System.out.println("Connect to database successfully");
	         MongoCollection<Document> collection = mongoDatabase.getCollection("test");
	         FindIterable<Document> findIterable = collection.find();  
	         MongoCursor<Document> mongoCursor = findIterable.iterator();  
	         while(mongoCursor.hasNext()){  
	            System.out.println(mongoCursor.next());  
	         }  
	      }catch(Exception e){
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      }
	   }
	
}
