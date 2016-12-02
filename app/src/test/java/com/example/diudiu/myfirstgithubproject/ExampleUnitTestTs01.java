package com.example.diudiu.myfirstgithubproject;

import org.junit.Test;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

import static org.junit.Assert.assertEquals;

/**
 * Created by yintaishan on 01/12/2016.
 */

public class ExampleUnitTestTs01 {

    @Test
    public void testJUnitTs(){

        JUnitTs jUnitTs = new JUnitTs(1000,"TaiShan");
        assertEquals(1000,jUnitTs.getNumber());

    }



    @Test
    public void testPublishSubject() {
        PublishSubject<String> stringPublishSubject = PublishSubject.create();
        stringPublishSubject.subscribe(new Observer<String>() {

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("Observable completed");
//                Log.i("dfk","skdffkljd");
            }

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("Observer consumed " + s);
            }
        });
        stringPublishSubject.onNext("hello world");
        stringPublishSubject.onComplete();
    }
}
