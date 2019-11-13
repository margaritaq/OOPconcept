public class MessageConvertor {
    public JsonMessage parsXmlToJson(MessageType message) {
        return new JsonMessage(message.getBody());
    }

    public XmlMessage parsJsonToXml(MessageType message) {
        return new XmlMessage(message.getBody());
    }

}

