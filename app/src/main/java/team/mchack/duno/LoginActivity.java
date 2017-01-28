package team.mchack.duno;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity{

    private String email;
    private String password;

    Button authenticate_Button, register_Button;
    TextView feedback;
    EditText pwd_field;
    EditText email_field;

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        authenticate_Button=(Button)findViewById(R.id.button2);
        register_Button=(Button)findViewById(R.id.button3);
        setContentView(R.layout.activity_login);
        feedback=(TextView)findViewById(R.id.textView);

    }

    protected void getLoginInfo(){
        pwd_field=(EditText)findViewById(R.id.editText2);
        email_field=(EditText)findViewById(R.id.editText);

        email=email_field.getText().toString();
        password=pwd_field.getText().toString();
    }
    public void authenticate_User(View v){

        getLoginInfo();
        String admin_Email="dummy@email.com";
        String admin_pwd="dummy";

        // private int counter
        if(email.equals(admin_Email)&&password.equals(admin_pwd)){
            setContentView(R.layout.activity_main);
            feedback.setText("Loading");
        }else{

            feedback.setText("Not Authenticated, try again");
            feedback.setTextColor(Color.RED);
        }
    }
    public void register(View v){
        feedback.setTextColor(Color.BLUE);
        // implement the login function here
        feedback.setText("Successfully Registered! Now you can login using your new account");



    }
}

