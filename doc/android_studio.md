# Android studio
## Working with XML
### Tips and tricks
#### Comments
to comment in xml: `{xml}<!-- -->`.

Changing color:
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black"
    tools:context=".FirstFragment">
    <!-- This is the way to add comments-->

    <TextView
        android:id="@+id/textview_first"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@color/purple_500"/> 
</androidx.constraintlayout.widget.ConstraintLayout>
```

the `@color/purple_500` is specified under `res/values/colors.xml`
Furthermore, that the colors are specified using the `<color></color>` tags


### Constraint layout
Note that the constraint layout can also be modified using the attributes tab to the right in android studio. Furthermore, that a background can be added there. 