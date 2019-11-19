public class XmlMessage implements MessageType {
    private static final String name = "XML";
    private String body;

    public XmlMessage(String body) {
        this.body = body;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void prepareMessage() {
        System.out.println("NO message");
    }

    public void prepareMessage(String body) {
        System.out.println(body);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
