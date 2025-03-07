#import <React/RCTEventEmitter.h>

#import "generated/RNReactNativeFsSpec/RNReactNativeFsSpec.h"

@interface ReactNativeFs : RCTEventEmitter <
  NativeReactNativeFsSpec
#if !TARGET_OS_OSX
  ,UIDocumentPickerDelegate
#endif
>

@property (retain) NSMutableDictionary* downloaders;
@property (retain) NSMutableDictionary* uuids;
@property (retain) NSMutableDictionary* uploaders;

@end
