package fit.nlu.utils;

public interface Config {
    String IP = "192.168.1.41";
    String PORT = "8081";
    String WS_URL = "ws://" + IP + ":" + PORT + "/ws/websocket";
    String BASE_URL = "http://" + IP + ":" + PORT + "/";
}
