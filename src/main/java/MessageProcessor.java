public class MessageProcessor {
    public void printMessage(MessageType message) {
        System.out.println(message.getName() + " body: " + message.getBody());
    }
}
