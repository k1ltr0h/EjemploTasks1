package cl.telematica.tasks1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class TaskActivity extends Activity {
	
	private ProgressBar progressBar;
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task);
		
		progressBar = (ProgressBar) findViewById(R.id.progressBar1);
		button = (Button) findViewById(R.id.button1);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				progressBar.setMax(100);
				progressBar.setProgress(0);
		 
		        for(int i=1; i<=10; i++) {
		            task();
		            progressBar.incrementProgressBy(10);
		        }
		 
		        Toast.makeText(TaskActivity.this, "Tarea finalizada!",
		                Toast.LENGTH_SHORT).show();
			}
		});
	}
	
	private void task()
	{
	    try {
	        Thread.sleep(1000);
	    } catch(InterruptedException e) {}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.task, menu);
		return true;
	}

}
