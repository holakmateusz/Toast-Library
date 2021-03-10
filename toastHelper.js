import { NativeModules } from "react-native";
const { RNNativeToastLibraryModule } = NativeModules;

const helperToast = (message) => {
  RNNativeToastLibraryModule.showToast(message);
};

export default helperToast;
