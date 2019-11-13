public class JsonMessage implements MessageType {
    private String name = "Json";
    private String jsonBody;

    public JsonMessage() {
    }

    public JsonMessage(String body) {
        this.jsonBody = body;
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
        return this.jsonBody;
    }

    public void setBody(String body) {
        this.jsonBody = body;
    }
}


