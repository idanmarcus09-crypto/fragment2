package com.example.fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EmailFragment extends Fragment {
    EditText ETtext, ETemail;
    Button btnSendEmail;

    public EmailFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_email, container, false);

        ETtext = view.findViewById(R.id.ETtext);
        ETemail = view.findViewById(R.id.ETemail);
        btnSendEmail = view.findViewById(R.id.btnSendEmail);

        btnSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = ETtext.getText().toString();
                String email = ETemail.getText().toString();
                Toast.makeText(getActivity(), email + " - " + msg, Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}

