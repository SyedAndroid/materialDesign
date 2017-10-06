// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleListActivity$ViewHolder$$ViewBinder<T extends com.example.xyzreader.ui.ArticleListActivity.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624084, "field 'thumbnailView'");
    target.thumbnailView = finder.castView(view, 2131624084, "field 'thumbnailView'");
    view = finder.findRequiredView(source, 2131624080, "field 'titleView'");
    target.titleView = finder.castView(view, 2131624080, "field 'titleView'");
    view = finder.findRequiredView(source, 2131624085, "field 'subtitleView'");
    target.subtitleView = finder.castView(view, 2131624085, "field 'subtitleView'");
  }

  @Override public void unbind(T target) {
    target.thumbnailView = null;
    target.titleView = null;
    target.subtitleView = null;
  }
}
