package slot12;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate;
    int [] rateList = new int[3];


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void Display() {
        System.out.println("Title " +title);
        System.out.println("PublishDate " + publishDate);
        System.out.println("Author " +author);
        System.out.println("Content " +content);
        System.out.println("AverageRate" +averageRate);
    }
    public void Calcude(){
        int sum = 0;
        for (int i =0; i< rateList.length; i++ ){
            sum += rateList[i];
        }
        averageRate = (float) sum / rateList.length;
    }

    public void InputRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of ratings: ");
        int num0f = scanner.nextInt();
        int [] rateList = new int [num0f];
        for (int i = 0; i < num0f && i < rateList.length; i++) {
            System.out.print("Enter rating " + (i + 1) + ": ");
            int rating = scanner.nextInt();
            if (rating >= 1 && rating <= 5){
                rateList[i] = rating;
            } else {
                System.out.println("Invalid rating! Please enter a rating between 1 and 5.");
                i--;
            }
        }
        Calcude();
    }
}
