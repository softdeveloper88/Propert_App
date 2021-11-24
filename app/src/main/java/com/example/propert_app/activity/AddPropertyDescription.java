package com.example.propert_app.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.eastearly.richedittextview.RichEditText;
import com.example.propert_app.R;


public class AddPropertyDescription extends AppCompatActivity {

    private RichEditText mRichEditText;
    private WebView mWebView;
    private TextView mPlainHtml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_property_description);
//        AREditor arEditor = this.findViewById(R.id.areditor);
//        arEditor.setExpandMode(AREditor.ExpandMode.FULL);
//        arEditor.setHideToolbar(false);
//        arEditor.setToolbarAlignment(AREditor.ToolbarAlignment.BOTTOM);
//        initToolbar();
        mRichEditText = (RichEditText)findViewById(R.id.rich_edittext);
        mWebView = (WebView)findViewById(R.id.load_webview);
        mPlainHtml = (TextView)findViewById(R.id.plainhtml);
        mRichEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mWebView.loadData(mRichEditText.toHtml(), "text/html; charset=utf-8",null);
                mPlainHtml.setText(mRichEditText.toHtml());
            }
        });

    }
    @Override
    public void onResume(){
        super.onResume();
        String plainHtml = mRichEditText.toHtml();
        mPlainHtml.setText(plainHtml);
        mWebView.loadData(plainHtml, "text/html; charset=utf-8",null);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

