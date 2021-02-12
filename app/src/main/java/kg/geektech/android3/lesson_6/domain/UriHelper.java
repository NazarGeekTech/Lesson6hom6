package kg.geektech.android3.lesson_6.domain;

import android.content.Context;

import java.net.URI;

import kg.geektech.android3.lesson_6.R;

public class UriHelper {

    private final Context context;

    public UriHelper(Context context) {
        this.context = context;
    }

    public String validate(String uri) {
        if (isUrl(uri)) {
            return context.getString(R.string.url);
        } else if (isPath(uri)) {
            return context.getString(R.string.path);
        } else {
            return context.getString(R.string.unknown);
        }
    }

    private boolean isUrl(String uri) {
        return "http".equals(URI.create(uri).getScheme());
    }

    private boolean isPath(String uri) {
        return "file".equals(URI.create(uri).getScheme());
    }

}
