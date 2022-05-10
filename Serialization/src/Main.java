
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        MyAccount account = new MyAccount();

        account.AccountName = "MyAccount";
        account.AccountPassword = 1234;

        FileOutputStream FileOutput = new FileOutputStream("Account.ser");
        ObjectOutputStream ObjectOutput = new ObjectOutputStream(FileOutput);

        ObjectOutput.writeObject(account);
        FileOutput.close();
        ObjectOutput.close();

        System.out.println("File Serialized");

    }
}
