public interface MessageType {
    String getName();

    void prepareMessage();

    void prepareMessage(String body);

    String getBody();
}