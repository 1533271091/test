import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        String exchange = QueueEnum.QUEUE_ORDER_CANCEL.getExchange();
        HashSet<Object> objects1 = new HashSet<>();
//        objects1.add(1);
//        objects1.add(null);
//        objects1.add(null);
//        objects1.add("lxy");
//        System.out.println(objects1);

//        HashMap<Object, Object> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,1);
//        map.put(3,1);
//        map.put(null,null);
//        map.put(6,null);
//        System.out.println(map);

//        Hashtable<Object, Object> hashtable = new Hashtable<>();
//        hashtable.put(1,1);
//
//        System.out.println(hashtable);
//
//
//        Vector<Object> objects = new Vector<>();
//
//        ArrayList<Object> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
        User user1 = new User("lxy",24,"man");
        User user2 = new User("lxy",24,"man");
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        System.out.println(user2.equals(user1));

//        User user3 = new User("xdd",22,"girl");
//        User user4 = new User("是",22,"girl");
//
//        HashSet<Object> set = new HashSet<>();
//        set.add(user1);
//        set.add(user2);
//        set.add(user3);
//        set.add(user4);
//        System.out.println(set);
    }
}
