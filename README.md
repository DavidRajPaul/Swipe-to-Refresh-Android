# Swipe-to-Refresh-Android
Swipe to Refresh android sample



The SwipeRefreshLayout should be used whenever the user can refresh the contents of a view via a vertical swipe gesture. The activity that instantiates this view should add an OnRefreshListener to be notified whenever the swipe to refresh gesture is completed. The SwipeRefreshLayout will notify the listener each and every time the gesture is completed again; the listener is responsible for correctly determining when to actually initiate a refresh of its content. If the listener determines there should not be a refresh, it must call setRefreshing(false) to cancel any visual indication of a refresh. If an activity wishes to show just the progress animation, it should call setRefreshing(true). To disable the gesture and progress animation, call setEnabled(false) on the view.

This layout should be made the parent of the view that will be refreshed as a result of the gesture and can only support one direct child. This view will also be made the target of the gesture and will be forced to match both the width and the height supplied in this layout. The SwipeRefreshLayout does not provide accessibility events; instead, a menu item must be provided to allow refresh of the content wherever this gesture is used. 


Please refer https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html for more information.


***Note:***

To use SwipeRefreshLayout make sure you have updated Android Support Library. To check if it is updated follow below steps:

--> Open Eclipse

--> Go to Window-> Android SDK Manager.

--> In SDK Manager scroll down to bottom. Look for Android Support Library. If rev. is 19.1 then you are good to use SwipeRefreshLayout. If it is less than 19.1, then update Androd Support Library.

--> Once it is updated you can use SwipeRefreshLayout for new project. But you still cannot use SwipeRefreshLayout for existing projects.

***Below are the steps to use SwipeRefreshLayout in existing project:***

--> After updating Android Support Library, create new project.

--> Look for android-support-v4.jar in this project.

--> Copy android-support-v4.jar from new project and replace android-support-v4.jar of existing project with new project's android-support-v4.jar.

--> Now you can use SwipeRefreshLayout in existing project as well. 

--> For more cool stock android experience update to Android Support Library rev. 21

Since it's in the support library, you can simply include the library and use it. If you are referring to whether or not it can work with native Fragment instead of Fragment provided by the support library, it can.
