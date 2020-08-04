import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mybussinessapp.R;

public class User_activity extends AppCompatActivity {




    public class MainActivity extends AppCompatActivity {

        EditText SupplierfirstName;
        EditText SupplierlastName;
        EditText address;
        EditText email;
        Button register;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.user_activity);
            SupplierfirstName = findViewById(R.id.SupplierfirstName);
            SupplierlastName = findViewById(R.id.SupplierlastName);
            address = findViewById(R.id.address);
            email = findViewById(R.id.email);
            register = findViewById(R.id.register);

            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    checkDataEntered();
                }
            });
        }


        boolean isEmail(EditText text) {
            CharSequence email = text.getText().toString();
            return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
        }

        boolean isEmpty(EditText text) {
            CharSequence str = text.getText().toString();
            return TextUtils.isEmpty(str);
        }

//registration toast alert message
        void checkDataEntered() {
            if (isEmpty(SupplierfirstName)) {
                Toast t = Toast.makeText(this, "You must enter first name to register!", Toast.LENGTH_SHORT);
                t.show();
            }

            if (isEmpty(SupplierlastName)) {
                SupplierlastName.setError("Last name is required!");
            }

            if (isEmail(email) == false) {
                email.setError("Enter valid email!");
            }

        }
    }

}
