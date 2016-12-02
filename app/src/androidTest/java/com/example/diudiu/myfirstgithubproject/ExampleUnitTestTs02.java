package com.example.diudiu.myfirstgithubproject;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by yintaishan on 01/12/2016.
 */

public class ExampleUnitTestTs02 extends ActivityInstrumentationTestCase2 {

    public ExampleUnitTestTs02(Class activityClass) {
        super(activityClass);
    }

    public void testPublishSubject() {
        PublishSubject<String> stringPublishSubject = PublishSubject.create();
        stringPublishSubject.subscribe(new Observer<String>() {

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("Observable completed");
                Log.i("dfk","skdffkljd");
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
