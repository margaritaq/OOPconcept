public class MainClass {
    public static void main(String[] args) {
        XmlMessage xmlMessage = new XmlMessage("Super message");
        System.out.println(xmlMessage.getName());
        System.out.println("body= " + xmlMessage.getBody());
        xmlMessage.prepareMessage();
        xmlMessage.prepareMessage("Something new");
        xmlMessage.prepareMessage("Json", "Facility");
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.printMessage(xmlMessage);

    }
}
