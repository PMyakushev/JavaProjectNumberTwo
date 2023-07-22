package Unit_5.HomeWork.Info;


import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


//public class FileHandler {
//    public static void importContacts(PhoneBook phoneBook, String filename) throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get(filename));
//        StringBuilder sb = new StringBuilder();
//        for (String line : lines) {
//            if(line.isEmpty()){
//                phoneBook.addContact(Contact.fromString(sb.toString()));
//                sb = new StringBuilder();
//            }
//            else{
//                sb.append(line).append("\n");
//            }
//        }
//    }
//
//
//}