/**
 * Created by cerebro on 19/11/15.
 */
public class Demo {

    public static void main(String[] args) {

        try {
            Demo.sendSms("Your OTP is 9876", 5);
        } catch (LowBalanceException e) {
            System.out.println("we are sending email to admin for recharging.");
        } catch (MobileOutOfReachException e) {
            System.out.println("We are showing message in our app, asking user to come out in open");
        } catch (Exception e) {

        } finally {
          //
        }

        //

        try {
            Demo.sendSms("10000 debited to your account", 5);
        } catch (Exception e) {

            System.out.println("Send email with debit info");
        }


    }

    public static void sendSms(String smsBody, int userId) throws Exception {


        int balance = 100;

        String phone = Demo.getPhoneNumber(userId);

        if (balance <= 0) {
            throw new LowBalanceException("Not enough balance to send the sms");
        }

        boolean success = false;

        if (!success) {
            throw new MobileOutOfReachException("Mobile number not in reach");
        }

        System.out.println("successfully sent sms. the sent text is: " + smsBody);
    }


    public static String getPhoneNumber(int userid) throws Exception {
        throw new Exception("User not found");
    }
}
