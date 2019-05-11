//
//  RNBoilerplate.swift
//  RNBoilerplate
//
//  Created by THE3796 on 06/05/2019.
//  Copyright © 2019 Theo Herveux. All rights reserved.
//

import Foundation

@objc(RNBoilerplate)
class RNBoilerplate: NSObject {
    @objc
    func promiseRN(_ resolve: (RCTPromiseResolveBlock), rejecter reject: (RCTPromiseRejectBlock)) {
        resolve("#### Resolve done")
    }
}
