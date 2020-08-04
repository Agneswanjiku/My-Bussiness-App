import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.ActionMode;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mybussinessapp.R;

public class CashierActivity extends AppCompatActivity {

EditText CashierName;
EditText Date;
EditText Time;
EditText address;
EditText VerifiedBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cashieractivity);
        CashierName= findViewById(R.id.cashierName);
        Date = findViewById(R.id.date);
        Time = findViewById(R.id.time);
        address = findViewById(R.id.address);
         VerifiedBy= findViewById(R.id.VerifiedBY);

        VerifiedBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }

            private void checkDataEntered() {
                return;
            }
        });
    }


    boolean isCashierName(EditText text) {
        CharSequence cashiername = text.getText().toString();
        return (!TextUtils.isEmpty(cashiername) && Patterns.EMAIL_ADDRESS.matcher(cashiername).matches());
    }
}
