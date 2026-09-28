package ai.mayra.assistant;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(com.getcapacitor.community.keepawake.KeepAwakePlugin.class);
        super.onCreate(savedInstanceState);
        
        // Optimize WebView for modern Audio/Video Real-Time Streams and Low Latency
        try {
            WebView webView = this.getBridge().getWebView();
            WebSettings settings = webView.getSettings();
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setAllowFileAccess(true);
            settings.setAllowContentAccess(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
