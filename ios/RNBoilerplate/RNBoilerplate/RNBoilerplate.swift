//
//  RNBoilerplate.swift
//  RNBoilerplate
//
//  Created by THE3796 on 06/05/2019.
//  Copyright © 2019 Theo Herveux. All rights reserved.
//

import Foundation

@objc(RNBridgeModule)
class RNBridgeModule: NSObject {
    @objc
    func promiseRN(_ resolve: RCTPromiseResolveBlock, rejecter reject: RCTPromiseRejectBlock) {
        resolve("#### Resolve done")
    }
    
    @objc
    func callbackRN(_ callback: RCTResponseSenderBlock) {
        let resultDict: NSDictionary = [
            "result": "callback called"
        ]
        callback([NSNull(), resultDict])
    }
    
  
}
