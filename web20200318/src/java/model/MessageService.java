/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
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
