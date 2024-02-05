import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/foundation.dart';

Future initFirebase() async {
  if (kIsWeb) {
    await Firebase.initializeApp(
        options: const FirebaseOptions(
            apiKey: "AIzaSyCdOC4dMhlpdNdwS6COq2mUEDnPe5DPLwk",
            authDomain: "botaniqscape-18f97.firebaseapp.com",
            projectId: "botaniqscape-18f97",
            storageBucket: "botaniqscape-18f97.appspot.com",
            messagingSenderId: "482004477751",
            appId: "1:482004477751:web:c0d90272b8692e1f09dcb2"));
  } else {
    await Firebase.initializeApp();
  }
}
