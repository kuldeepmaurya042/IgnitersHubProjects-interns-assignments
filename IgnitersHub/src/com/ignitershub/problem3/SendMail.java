package com.ignitershub.problem3;

import java.io.File;
import java.io.FileNotFoundException;

public class SendMail {
    public static void main(String[] args) throws FileNotFoundException {
    	System.out.println("Initiated");
        EmailSender emailSender = new EmailSender();
        String to = "hr@ignitershub.com";
        String from = "kuldeepmaurya1407@gmail.com";
        String subject = "Challenge 3 Completed";
        String text = "Name: Kuldeep Maurya\nSemester: (8th)Pass Out 2023\nBranch: Computer Science and Engineering\nRoll No.: 2003840109008";
        File file = new File("D:\\image.jpg");      

        //Calling method of EmailSender Class
        boolean b = emailSender.sendEmailWithAttachment(to, from, subject, text, file);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("Error in sending email !!");
        }

    }
}
