import java.util.concurrent.ConcurrentHashMap;

public class OnlineUsers {
    public static void main(String[] args) {

        // Thread-safe map to store online users
        ConcurrentHashMap<String, Boolean> onlineUsers = new ConcurrentHashMap<>();

        // Users coming online
        onlineUsers.put("Aman", true);
        onlineUsers.put("Rohan", false);
        onlineUsers.put("Priya", true);

        // Check who is online
        System.out.println("Online: " + onlineUsers);

        // Someone logs out
        onlineUsers.remove("Aman");

        // Updated list
        System.out.println("After Logout: " + onlineUsers);
    }}
