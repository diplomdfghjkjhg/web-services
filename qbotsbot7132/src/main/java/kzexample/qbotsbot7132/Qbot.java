package kzexample.qbotsbot7132;


import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class Qbot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Qbots7132_bot";
    }

    @Override
    public String getBotToken() {
        return "5152879177:AAHh6VtTZXDdS_5HU1kfKUoi1pSOuMiyCYQ";
    }

    @Override
    public void onUpdateReceived(Update update) {

        SendMessage sendMessage = new SendMessage();
        Message message_get = update.getMessage();
        String message_text = update.getMessage().getText();
        String chat_id = String.valueOf(update.getMessage().getChatId());

        sendMessage.setChatId(chat_id);
        sendMessage.setText("Hi!");
        sendMessage.setReplyToMessageId(message_get.getMessageId());

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        /*if (update.hasMessage() && update.getMessage().hasText()){
            SendMessage sendMessage = new SendMessage();
            Message message_get = update.getMessage();
            String message_text = update.getMessage().getText();
            String chat_id = String.valueOf(update.getMessage().getChatId());

             if (message_text.equals("/start")){

                 sendMessage.setChatId(chat_id);
                 sendMessage.setText("Введите Ваше имя?");
                 sendMessage.setReplyToMessageId(message_get.getMessageId());

                 try {
                     execute(sendMessage);
                 }catch (TelegramApiException e){
                     e.printStackTrace();
                 }
             }else if (message_text.equals("/start")){
                 sendMessage.setChatId(chat_id);
                 sendMessage.setText("Здравствуйте ");
                 sendMessage.setReplyToMessageId(message_get.getMessageId());
             }

        }*/

    }
}
