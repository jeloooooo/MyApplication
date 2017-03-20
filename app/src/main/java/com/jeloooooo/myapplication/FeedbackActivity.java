package com.jeloooooo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

/**
 * Created by ap186046 on 3/18/2017.
 */

public class FeedbackActivity extends AppCompatActivity {

    private Button btnSendFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_feedback);

        btnSendFeedback = (Button) findViewById(R.id.bt_go_back);

        btnSendFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }

    public void sendFeedback(View button) {
        // Do click handling here
        final EditText nameField = (EditText) this.findViewById(R.id.txtName);
        String name = nameField.getText().toString();

        final EditText emailField = (EditText) this.findViewById(R.id.txtEmail);
        String email = emailField.getText().toString();

        final EditText feedbackField = (EditText) this.findViewById(R.id.txtFeedbackBody);
        String feedback = feedbackField.getText().toString();

        final Spinner feedbackSpinner = (Spinner) this.findViewById(R.id.spnnrFeedbackType);
        String feedbackType = feedbackSpinner.getSelectedItem().toString();

        final CheckBox responseCheckbox = (CheckBox) this.findViewById(R.id.chkboxResponse);
        boolean bRequiresResponse = responseCheckbox.isChecked();

        final TextView SummaryField = (TextView) this.findViewById(R.id.lblSummary);
        SummaryField.setText((name + ", " + email + ", " + feedback + ", " + feedbackType));
    }
}
