package com.example.signin_signup_profile.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;

import com.example.signin_signup_profile.R;
import com.example.signin_signup_profile.TruyenSinhVien;

public class MainActivity2 extends AppCompatActivity implements TruyenSinhVien {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void DataStudent(SinhVien sinhVien) {
        Fragment fragmentStudentInfo = getFragmentManager().findFragmentById(R.id.fragmentInfo);
        //fragmentStudentInfo.SetInfo(sinhVien);
    }
}