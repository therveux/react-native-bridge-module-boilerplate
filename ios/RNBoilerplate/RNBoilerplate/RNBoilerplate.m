//
//  RNBoilerplate.m
//  RNBoilerplate
//
//  Created by THE3796 on 06/05/2019.
//  Copyright © 2019 Theo Herveux. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(RNBridgeModule, NSObject)

RCT_EXTERN_METHOD(promiseRN: (RCTPromiseResolveBlock)resolve
                  rejecter: (RCTPromiseRejectBlock)reject)

RCT_EXTERN_METHOD(callbackRN: (RCTResponseSenderBlock): callback)

@end
