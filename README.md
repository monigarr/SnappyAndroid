SnappyAndroid
=============

Demo of Android snap fish clone project to show my Android development skills. 

Status
=======
Work in Progress. 
Start Date: Feb. 15th 2014 2pm

Features
==========
Let users send photo / video messages to other users. The messages will be deleted after they are viewed. Tab based navigation, list view (messages, friend screen). Parse.com cloud storage to handle accounts, file storage, and message storage. Use the same Parse.com db as I am using for my iOS version of this project.

Tabs
=====
Friends
Messages
Camera

Activities
===========
MainActivity
LoginActivity
SignUpActivity
CameraActivity
MessagesActivity

Design
=======
* Start with empty project in Eclipse.
* Add Activities, Intents.
* Stub out login and signup screens.
* Use graphics from templates that I designed with Adobe CS6 Illustrator.

Add Parse.com and Add Friends
=============================
* Add Parse.com baas platform, user account management from current db I created for the iOS version of this mobile app.
* Show error message if something goes wrong with login / signup.
* SignUp screen. 
* Login screen.
* Save user info on the device.
* Sync local data with remote data.

User Relations with Parse.com
==============================
* Add "friends" in app to have Parse user objects relate with each other.
* Screen to get all available users, add or delete them as friends.
* Populate main friends screen with list of friends.

Capture Photo & Video
=====================
* Load default capture photo and video. 
* Save captured media to gallery.
* Let user choose friends to receive self destructing message.
* Upload photo or video to Parse.com and save message details to include sender and receiver.

Retrieve & View Data
====================
* Download and show messages from Parse.com into our app.
* Query Parse.com to get all unseen messages for logged in user. 
* View messages that will disappear after 10 seconds. 
* Show video with...
* Show images with...
