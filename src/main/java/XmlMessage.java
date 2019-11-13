public class XmlMessage implements MessageType {
    private String name = "XML";
    private String xmlBody;

    public XmlMessage() {
    }

    public XmlMessage(String body) {
        this.xmlBody = body;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void prepareMessage() {
        System.out.println("NO message");
    }

    public void prepareMessage(String a) {
        System.out.println(a);
    }

    public void prepareMessage(String a, String b) {
        System.out.println(a + " " + b);

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBody() {
        return this.xmlBody;
    }

    public void setBody(String body) {
        this.xmlBody = body;
    }
}
