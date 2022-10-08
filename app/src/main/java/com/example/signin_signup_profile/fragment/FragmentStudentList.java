package com.example.signin_signup_profile.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.signin_signup_profile.R;
import com.example.signin_signup_profile.TruyenSinhVien;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {

    ArrayList<SinhVien> arraySinhVien;
    StudentAdapter adapter;

    TruyenSinhVien truyenSV;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        truyenSV = (TruyenSinhVien) getActivity();

        arraySinhVien = new ArrayList<>();
        AddArraySV();
        adapter = new StudentAdapter(getActivity(), R.layout.row_student, arraySinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list,container,false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSV.DataStudent(arraySinhVien.get(position));

    }

    private void AddArraySV(){
        arraySinhVien.add(new SinhVien("Hồ Thị Ái Thi", 2002,"Phú Bài", "aithi202@gmail.com"));
        arraySinhVien.add(new SinhVien("Lê Thị Hoài Thu", 2002,"Đại Lộc", "thule.240602@gmail.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn Tú", 2002,"Đại Quang", "tu2k@gmail.com"));
        arraySinhVien.add(new SinhVien("Phan Anh Quốc", 2002,"Quảng Ngãi", "anhquoc@gmail.com"));
        arraySinhVien.add(new SinhVien("Lưu Văn Tùng", 2002,"Quảng Ninh", "lvtung0666@gmail.com"));
        arraySinhVien.add(new SinhVien("Hồ Hải Duy", 2002,"Phú Ninh", "haiduytt@gmail.com"));
    }
}


