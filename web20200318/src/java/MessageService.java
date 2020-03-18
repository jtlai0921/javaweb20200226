public class MessageService {
    public Message[] testMessages;
    public MessageService() {
        testMessages = new Message[3];
        testMessages[0] =
                new Message("John", "John's message!");
        testMessages[1] =
                new Message("Mary", "Mary's message!");
        testMessages[2] =
                new Message("Janet", "Janet's message!");
    }
    public Message[] getMessages() {
        return testMessages;
    }      
}
