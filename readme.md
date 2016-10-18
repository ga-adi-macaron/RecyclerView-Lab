---
title: RecyclerView
type: Lab
duration: "1:30"
creator:
    name: Alan Caceres
    city: NYC
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Fun? With RecyclerViews

## Introduction
> ***Note:*** _This can be a pair programming activity or done independently._

In this lab you will be using your knowledge of
RecyclerView to build an app.

## Exercise

#### Requirements

##### Activities
- You need to create one Activity to hold your RecyclerView

##### RecyclerView
- Add the RecylerView to your XML
- Get a reference to the `XML` created `RecyclerView` inside the `onCreate()` method in `Java` in both activities.
- Set up the layout manager for the `RecyclerView` in both activities.

---

##### Custom View Layout
- Create a custom `XML` layout that replicates the following.

<img src="screenshots/screen2.png" height="60px" width="320px"/>

##### Custom RecyclerView ViewHolder
- Create a custom `RecyclerView ViewHolder`.
- The `ViewHolder` should get a reference to the custom view layout you created in `XML`.

##### Custom Object
- Create a custom `Java` objects that hold this data:
- The object should hold a `title`, a `description`, a `color`, and a `check` to see if the item was selected.
- Make sure you create `getters/setters` and `constructors` that will help you with the requirements.

##### Custom RecyclerView Adapter
- Create a custom `RecyclerView Adapter`.
- The adapter should use the custom `ViewHolder`.
---

##### OnClickListener
- Have the `OnClickListener` show a `Toast` that changes the checked value of both the object and view. Make sure it maintains that checked state when scrolling.

---

##### MainActivity
- Create and populate a `List` that contains ten instances of your custom `Java` object.
- Provide the custom adapter this list to use.
- Set your custom adapter on the `RecyclerView`.

---

**Bonus:**
How would you change your classes to allow for more than one type of view in one RecyclerView adapter?

#### Deliverable
A pull request from forked GitHub repo that contains your implementation of the requirements.

### Additional Resource:
[Android: RecyclerView](https://developer.android.com/training/material/lists-cards.html)
