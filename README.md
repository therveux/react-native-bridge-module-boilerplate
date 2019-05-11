# React Native Bridge Module Boilerplate

Boilerplate to show how to create a native bridge module for React-Native applications using Swift and Kotlin languages but also how to share this module on [NPM](https://www.npmjs.com/).
This repository details the steps to create the native bridge module but also allows you to use it to better understand it.

## Why ?

As a React-Native developer, I have often had to program in several native languages such as Objective-C, Swift, Java or even Kotlin.
I had no experience with iOS or Android development, so I find that Swift and Kotlin languages are more user-friendly with a background like mine.

I have also often wanted to create native features for both platforms.
Sometimes you want a feature that already exists but does not fully meet your needs.
It may be relevant to contribute to the improvement of this feature and sometimes not...
So I decided to create a tutorial to explain how to create your own features by gathering all the knowledge I could find here

## Usage

```bash
# Installation
yarn add react-native-boilerplate
```

```jsx
import RNBoilerplate from 'react-native-boilerplate
```

## Linking method

Following official React-Native documentation, [manually link]() the dependency.

## <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/2000px-Apple_logo_black.svg.png" width=30/> iOS

Open your Xcode project and locate **Libraries** directory, right click on it and select **Add files to "yourprojectname"**

Find **react-native-boilerplate** directory inside your **node_modules**