package cn.itcast.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.function.Consumer;

public class MongoDBDemo {
    public static void main(String[] args) {
        //建立连接
        MongoClient mongoClient = MongoClients.create("mongodb://192.168.27.130:27017");
        //选择数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        //选择表
        MongoCollection<Document> collection = mongoDatabase.getCollection("user");
        //查询数据
        collection.find().limit(10).forEach((Consumer<? super Document>) document -> System.out.println(document.toJson()));
    }
}
