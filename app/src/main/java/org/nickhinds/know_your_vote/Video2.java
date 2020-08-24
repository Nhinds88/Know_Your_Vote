package org.nickhinds.know_your_vote;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Video2 extends Fragment {

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.video2, container, false);

		// string to embed this youtube video in the webView
		String frameVideo = "<iframe width=\"400\" height=\"315\" src=\"https://www.youtube.com/embed/NqOjj1FCcVY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";

		WebView displayYoutubeVideo = view.findViewById(R.id.webVid2);
		displayYoutubeVideo.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				return false;
			}
		});
		// enables JS needed for youtube and loaded the video, also in the AndroidManifest we have to enable hardware acceleration and give internet permissions
		WebSettings webSettings = displayYoutubeVideo.getSettings();
		webSettings.setJavaScriptEnabled(true);
		displayYoutubeVideo.loadData(frameVideo, "text/html", "utf-8");
		return view;
	}




}
