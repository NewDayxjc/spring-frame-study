package mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import mongodb.monitor.CommandListenerTest;
import org.bson.Document;

import java.util.Arrays;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/18 11:14
 * @name MongodbTest
 */
public class MongodbTest {
    public static void main(String[] args) {
        ConnectionString connectionString=new ConnectionString(
                "mongodb://localhost"
        );
//        MongoClientSettings settings=MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .retryWrites(true)
//                .build();
//        MongoClient mongoClient= MongoClients.create(settings);
        MongoClientSettings settingss =
                MongoClientSettings.builder()
                        .addCommandListener(new CommandListenerTest()).build();
        MongoClient client = MongoClients.create(settingss);
        MongoDatabase database=client.getDatabase("test");
        System.out.println(database.getName());
        MongoCollection<Document> test = database.getCollection("test");
//        for (Document document : test.find()) {
//            System.out.println("json格式"+document.toJson());
//            System.out.println("document"+document);
//        }

        Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));
        test.insertOne(doc);



//        Publisher<InsertOneResult> publisher = test.insertOne(doc);

//        for (Method declaredMethod : database.getClass().getDeclaredMethods()) {
//            System.out.println(declaredMethod);
//        }
    }
}
