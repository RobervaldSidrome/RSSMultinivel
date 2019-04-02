package com.example.jamiltondamasceno.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jamiltondamasceno.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_sobre);
        String descricao = "A Plataforma I Home webapp e app tem como missão conectar clientes e prestadores de serviços residenciais, que sua finalidade é o sucesso através da excelência em gestão e da busca pela Qualidade.\n\n" +
                "Nosso trabalho é dar suporte aos através da plataforma e certificar que a qualidade de nossa plataforma possa trazer benefícios e evolução dos serviços prestados bem como a otimização dos processos de prestações de serviços meios de pagamentos.";
        View sobre = new AboutPage(this)
                .setImage(R.drawable.ihomebig)
                .setDescription( descricao )
                .addGroup("Fale conosco")
                .addEmail("rsidrome@gmail.com", "Envie um e-mail")
                .addWebsite("http://webihome.com/", "Acesse nosso site")
                .addGroup("Acesse nossas redes sociais")
                .addFacebook("google", "Facebook" )
                .addTwitter("google", "Twitter")
                .addYoutube("google", "Youtube")
                .addPlayStore("com.google.android.apps.plus", "Play Store")
                .addGitHub("google", "Github")
                .addInstagram("google", "Instagram")
                .create();

        setContentView( sobre );

    }
}
