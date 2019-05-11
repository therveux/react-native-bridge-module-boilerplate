# React Native Bridge Module Boilerplate


<p align="center">
  <a href="https://github.com/Hurobaki/react-native-bridge-module-boilerplate/blob/master/LICENSE">
    <img src="https://img.shields.io/badge/license-MIT-blue.svg"/>
  </a>
  <a href="https://circleci.com/gh/Hurobaki/react-native-bridge-module-boilerplate">
    <img src="https://circleci.com/gh/Hurobaki/react-native-bridge-module-boilerplate.svg?style=shield" alt="Current CircleCI build status." />
  </a>
  <a href="https://david-dm.org/Hurobaki/react-native-bridge-module-boilerplate">
    <img src="https://david-dm.org/Hurobaki/react-native-bridge-module-boilerplate/status.svg" />
  </a>
  <a href="https://david-dm.org/Hurobaki/react-native-bridge-module-boilerplate?type=dev">
      <img src="https://david-dm.org/Hurobaki/react-native-bridge-module-boilerplate/dev-status.svg" />
  </a>
  <a href="https://www.npmjs.org/package/react-native-bridge-module-boilerplate">
    <img src="https://badge.fury.io/js/react-native-bridge-module-boilerplate.svg" alt="Current npm package version." />
  </a>
  <a href="https://github.com/Hurobaki/react-native-bridge-module-boilerplate/pulls">
    <img src="https://img.shields.io/badge/PRs-welcome-brightgreen.svg"/>
  </a>
</p>


Boilerplate to show how to create a native bridge module for React-Native applications using Swift and Kotlin languages but also how to share this module on [NPM](https://www.npmjs.com/).
This repository details the steps to create the native bridge module but also allows you to use it to better understand it.

## Why ?

As a React-Native developer, I have often had to program in several native languages such as Objective-C, Swift, Java or even Kotlin.
I had no experience with iOS or Android development, so I find that Swift and Kotlin languages are more user-friendly with a background like mine.

I have also often wanted to create native features for both platforms.
Sometimes you want a feature that already exists but does not fully meet your needs.
It may be relevant to contribute to the improvement of this feature and sometimes not...
So I decided to create a tutorial to explain how to create your own features by gathering all the knowledge I could find here.

## TODO List

- [ ] Provide Android Kotlin example
- [ ] Write documentation from scratch bridge module
- [ ] Export NativeModules Javascript
- [ ] Babelify source code


## Usage

```bash
# Installation

# Using Yarn
yarn add react-native-bridge-module-boilerplate

#Using Npm
npm install react-native-bridge-module-boilerplate --save
```

```jsx
import RNBoilerplate from 'react-native-boilerplate'
```

## Linking method

Following official React-Native documentation, [manually link](https://facebook.github.io/react-native/docs/linking-libraries-ios) the dependency.

## <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/2000px-Apple_logo_black.svg.png" width=30/> iOS

Open your Xcode project and locate **Libraries** directory, right click on it and select **Add files to "yourprojectname"**

Find **react-native-boilerplate** directory inside your **node_modules**

## Do it by your own



