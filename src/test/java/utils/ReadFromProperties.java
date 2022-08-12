package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromProperties {

    public Properties readProperties(String fileName) throws IOException {

        InputStream resource = FileExample2.class.getClassLoader().getResourceAsStream(fileName);
        Properties properties = new Properties();
        properties.load(resource);

        return properties;
    }

    public String readFirstName() throws IOException {
        String firstName = readProperties("createaccount.properties").getProperty("firstname");
        return firstName;
    }

    public String readLastName() throws IOException {
        String lastName = readProperties("createaccount.properties").getProperty("lastname");
        return lastName;
    }

    public String readUserName() throws IOException {
        String userName = readProperties("createaccount.properties").getProperty("user");
        return userName;
    }

    public String readPassword() throws IOException {
        String password = readProperties("createaccount.properties").getProperty("password");
        return password;
    }

    public String readPhoneNumber() throws IOException {
        String phoneNumber = readProperties("createaccount.properties").getProperty("phonenumber");
        return phoneNumber;
    }

    public String readBirthDay() throws IOException {
        String birthday = readProperties("createaccount.properties").getProperty("birthday");
        return birthday;
    }

    public String readMonth() throws IOException {
        String month = readProperties("createaccount.properties").getProperty("month");
        return month;
    }

    public String readYear() throws IOException {
        String year = readProperties("createaccount.properties").getProperty("year");
        return year;
    }

    public String readGender() throws IOException {
        String genderName = readProperties("createaccount.properties").getProperty("gender");

        String gender = "";
        if (genderName.equals("male")) {
            gender = "1";
        } else if (genderName.equals("women")) {
            gender = "2";
        } else if (genderName.equals("unspecified")) {
            gender = "3";
        } else {
            gender = "4";
        }

        return gender;
    }

    public String readEmail() throws IOException {
        String email=readProperties("createaccount.properties").getProperty("email");
        return email;
    }

    public String readPasswordAccount() throws IOException {
        String passwordaccount = readProperties("createaccount.properties").getProperty("passwordaccount");
        return passwordaccount;
    }


    public class FileExample2 {
    }


}
