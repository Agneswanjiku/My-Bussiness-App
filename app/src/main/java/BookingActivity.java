import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mybussinessapp.R;

public class BookingActivity extends AppCompatActivity {

EditText OfficeName;
EditText Date;
EditText Time;
EditText address;
EditText VerifiedBy;

    public BookingActivity() {
        super();
    }

    public BookingActivity(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingactivity);
        OfficeName= findViewById(R.id.officeName);
        Date = findViewById(R.id.date);
        Time = findViewById(R.id.time);
        address = findViewById(R.id.address);

        VerifiedBy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkDataEntered();
            }

            private EditText checkDataEntered() {
                return Date;
            }
        });
    }


    boolean isCashierName(EditText text) {
        CharSequence officename = text.getText().toString();
        return (!TextUtils.isEmpty(officename) && Patterns.EMAIL_ADDRESS.matcher(officename).matches());
    }
}
