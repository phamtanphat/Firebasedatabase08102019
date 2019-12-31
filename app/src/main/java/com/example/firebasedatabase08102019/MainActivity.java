package com.example.firebasedatabase08102019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Gửi lên là string
//        myRef.child("trungtam")
//                .setValue("khoa pham training")
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "Loi", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        // 2 : Object
//        Sinhvien sinhvien = new Sinhvien("Nguyen Van A","20");
//        myRef
//            .child("sinhvien")
//            .setValue(sinhvien)
//            .addOnCompleteListener(new OnCompleteListener<Void>() {
//                @Override
//                public void onComplete(@NonNull Task<Void> task) {
//                    if (task.isSuccessful()){
//                        Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(MainActivity.this, "Loi", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
        //3 : Hasmap
//        HashMap<String,String> map = new HashMap<>();
//        map.put("xe 2 banh","xe dap");
//        map.put("xe 4 banh","xe hoi");
//        myRef
//            .child("phuongtien")
//            .setValue(map)
//            .addOnCompleteListener(new OnCompleteListener<Void>() {
//                @Override
//                public void onComplete(@NonNull Task<Void> task) {
//                    if (task.isSuccessful()){
//                        Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(MainActivity.this, "Loi", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
    }
}
