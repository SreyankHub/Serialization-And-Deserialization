import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        MyAccount account;

        FileInputStream FileInput = new FileInputStream("C:\\Serialization\\Account.ser");
        ObjectInputStream ObjectInput = new ObjectInputStream(FileInput);

        account = (MyAccount) ObjectInput.readObject();

        FileInput.close();
        ObjectInput.close();

        System.out.println(account.AccountName);
        System.out.println(account.AccountPassword);

    }
}
