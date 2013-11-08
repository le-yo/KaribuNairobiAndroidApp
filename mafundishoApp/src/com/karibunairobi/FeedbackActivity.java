package com.karibunairobi;





import com.karibunairobi.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;

public class FeedbackActivity extends DashBoardActivity {
	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
		setHeader(getString(R.string.FeedbackActivityTitle), true, false);

	}

	public void ButtonOnClick(View view) {
		switch (view.getId()) {
		case R.id.buttonSend:
			EditText textTo;
			EditText textSubject;
			EditText textMessage;
			
			textTo = (EditText) findViewById(R.id.editTextTo);
			textSubject = (EditText) findViewById(R.id.editTextSubject);
			textMessage = (EditText) findViewById(R.id.editTextMessage);

			String to = textTo.getText().toString();
			String subject = textSubject.getText().toString();
			String message = textMessage.getText().toString();

			Intent email = new Intent(Intent.ACTION_SEND);
			email.putExtra(Intent.EXTRA_EMAIL, new String[] { to });
			// email.putExtra(Intent.EXTRA_CC, new String[]{ to});
			// email.putExtra(Intent.EXTRA_BCC, new String[]{to});
			email.putExtra(Intent.EXTRA_SUBJECT, subject);
			email.putExtra(Intent.EXTRA_TEXT, message);

			// need this to prompts email client only
			email.setType("message/rfc822");

			startActivity(Intent.createChooser(email,
					"Choose an Email client :"));
			break;
		}

	}
}
