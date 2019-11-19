public class MessageConvertor {
    public JsonMessage parsToJson(MessageType message) {
        return new JsonMessage(message.getBody());
    }

    public XmlMessage parsToXml(MessageType message) {
        return new XmlMessage(message.getBody());
    }


    }



