package com.example.seccion9_ejercicio.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.seccion9_ejercicio.Fragments.DetailsFragment;
import com.example.seccion9_ejercicio.Models.Mail;
import com.example.seccion9_ejercicio.R;

public class DetailsActivity extends AppCompatActivity {
  private String subject;
  private String message;
  private String sender;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);

    if (getIntent().getExtras() != null){
      subject = getIntent().getStringExtra("subject");
      message = getIntent().getStringExtra("message");
      sender = getIntent().getStringExtra("senderName");
    }

    Mail mail = new Mail(subject, message, sender);

    DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
    detailsFragment.renderMail(mail);
  }
}