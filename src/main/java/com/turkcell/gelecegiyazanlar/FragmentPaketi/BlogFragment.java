package com.turkcell.gelecegiyazanlar.FragmentPaketi;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.turkcell.gelecegiyazanlar.AdapterVeListenerPaketi.ViewPagerAdapter;
import com.turkcell.gelecegiyazanlar.AdapterVeListenerPaketi.ViewPagerAdapterBlogEtkinlik;
import com.turkcell.gelecegiyazanlar.AnimasyonPaketi.DerinSayfaDegisimi;
import com.turkcell.gelecegiyazanlar.DesignEklentileri.SlidingTabLayout;
import com.turkcell.gelecegiyazanlar.R;

import java.util.ArrayList;
import java.util.List;


public class BlogFragment extends android.support.v4.app.Fragment {
    Toolbar toolbar;
    public SlidingTabLayout tabs;
    CharSequence Titles[]={"GELECE�� YAZANLAR","MOB�L","ANDROID","IOS","WINDOWS PHONE"};
    int Numboftabs =5;

    ViewPager pager;
    ViewPagerAdapterBlogEtkinlik adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        toolbar=(Toolbar)getActivity().findViewById(R.id.tool_bar);
        View rootView= inflater.inflate(R.layout.fragment_blog, container, false);


        // Ba�l�klar�,tab say�s�n� adapterda tan�mlar
        adapter =  new ViewPagerAdapterBlogEtkinlik(getFragmentManager(),Titles,Numboftabs);


        pager = (ViewPager) rootView.findViewById(R.id.pagerBlog);
        pager.setAdapter(adapter);


        tabs = (SlidingTabLayout) rootView.findViewById(R.id.tabsBlog);
        tabs.setDistributeEvenly(true); // tablar�n d�zenlenebilir olmas�n� sa�lar
        tabs.setSelectedIndicatorColors(getResources().getColor(R.color.beyaz));

        tabs.setViewPager(pager);




        return rootView;
    }


}


