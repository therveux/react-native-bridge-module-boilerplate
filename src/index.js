import { NativeModules } from 'react-native'

const { RNBridgeModule } = NativeModules

export const BridgeModule = {
    usePromise: async () => {
        const result = await RNBridgeModule.promiseRN()
        console.log(`Promise result is : ${result}`);
    },
    useCallback: () => RNBridgeModule.callbackRN((err, result) => {
        if (err) throw err
        console.log(`Callback result is : ${result}`)
    })
}
