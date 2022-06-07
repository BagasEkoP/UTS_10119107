package com.example.a10119107_uts;

// Nama     : Bagas Eko Pambudi
// NIM      : 10119107
// Kelas    : IF-3

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.a10119107_uts.MainActivity;
import com.example.a10119107_uts.R;

public class viewpageradapter extends PagerAdapter {

    Context ctx;

    public viewpageradapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.viewpagerscreen, container, false);

        ImageView logo = view.findViewById(R.id.logo);
        ImageView dot1 = view.findViewById(R.id.dot1);
        ImageView dot2 = view.findViewById(R.id.dot2);

        TextView judul = view.findViewById(R.id.judul);
        TextView deskripsi = view.findViewById(R.id.deskripsi);

        Button selesai = view.findViewById(R.id.btn_selesai);


        switch (position) {
            case 0:
                logo.setImageResource(R.drawable.gambar1);
                dot1.setImageResource(R.drawable.dotselect);
                dot2.setImageResource(R.drawable.dotunselect);

                deskripsi.setText("Geser layar untuk informasi aplikasi.");

                selesai.setVisibility(view.GONE);


                break;
            case 1:
                logo.setImageResource(R.drawable.gambar2);
                dot1.setImageResource(R.drawable.dotunselect);
                dot2.setImageResource(R.drawable.dotselect);

                judul.setText("Catatan Harian");
                deskripsi.setText("Anda bisa membuat catatan disini");

                selesai.setVisibility(view.VISIBLE);

                break;

        }

        container.addView(view);
        return view;

    }
}
