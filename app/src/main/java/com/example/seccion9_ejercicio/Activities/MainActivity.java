package com.example.seccion9_ejercicio.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.seccion9_ejercicio.Fragments.DetailsFragment;
import com.example.seccion9_ejercicio.Fragments.ListFragment;
import com.example.seccion9_ejercicio.Models.Mail;
import com.example.seccion9_ejercicio.R;

public class MainActivity extends AppCompatActivity implements ListFragment.onFragmentInteractionListener {
  private boolean isMultiPanel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setMultiPanel();
  }

  @Override
  public void onListClick(Mail mail){
    if (isMultiPanel){
      DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
      detailsFragment.renderMail(mail);
    }else{
      Intent intent = new Intent(this, DetailsActivity.class);
      intent.putExtra("subject", mail.getSubject());
      intent.putExtra("messaje", mail.getMessage());
      intent.putExtra("senderName", mail.getSenderName());
      startActivity(intent);
    }
  }

  private void setMultiPanel(){
    isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.fragmentDeatilsMail) != null);
  }
}