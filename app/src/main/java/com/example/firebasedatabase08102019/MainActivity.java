package com.example.firebasedatabase08102019;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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

        //4 : Gui dang randomid
//        Sinhvien phat = new Sinhvien("Pham tan phat","26");
//        Sinhvien khoa = new Sinhvien("Pham truong dang khoa","30");
//        Sinhvien quan = new Sinhvien("Nguyen hoang quan","28");
//
//        myRef.child("giangvien").push().setValue(quan);



        // Doc ve
//        myRef.child("sinhvien").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                Sinhvien sinhvien = dataSnapshot.getValue(Sinhvien.class);
//                Log.d("BBB",sinhvien.getTen());
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });

        // doc ve
        myRef.child("giangvien").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Sinhvien sinhvien = dataSnapshot.getValue(Sinhvien.class);
                Log.d("BBB",dataSnapshot.getKey());
                Log.d("BBB",sinhvien.getTen());
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
