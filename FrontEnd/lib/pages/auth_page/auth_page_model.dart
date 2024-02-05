import '/flutter_flow/flutter_flow_util.dart';
import 'auth_page_widget.dart' show AuthPageWidget;
import 'package:flutter/material.dart';

class AuthPageModel extends FlutterFlowModel<AuthPageWidget> {
  ///  State fields for stateful widgets in this page.

  final unfocusNode = FocusNode();
  // State field(s) for AuthTabBar widget.
  TabController? authTabBarController;
  int get authTabBarCurrentIndex =>
      authTabBarController != null ? authTabBarController!.index : 0;

  // State field(s) for emailAddress widget.
  FocusNode? emailAddressFocusNode;
  TextEditingController? emailAddressController;
  String? Function(BuildContext, String?)? emailAddressControllerValidator;
  // State field(s) for password widget.
  FocusNode? passwordFocusNode;
  TextEditingController? passwordController;
  late bool passwordVisibility;
  String? Function(BuildContext, String?)? passwordControllerValidator;
  // State field(s) for confirmpassword widget.
  FocusNode? confirmpasswordFocusNode;
  TextEditingController? confirmpasswordController;
  late bool confirmpasswordVisibility;
  String? Function(BuildContext, String?)? confirmpasswordControllerValidator;
  // State field(s) for emailAddressSingIn widget.
  FocusNode? emailAddressSingInFocusNode;
  TextEditingController? emailAddressSingInController;
  String? Function(BuildContext, String?)?
      emailAddressSingInControllerValidator;
  // State field(s) for passwordSignIn widget.
  FocusNode? passwordSignInFocusNode;
  TextEditingController? passwordSignInController;
  late bool passwordSignInVisibility;
  String? Function(BuildContext, String?)? passwordSignInControllerValidator;

  /// Initialization and disposal methods.

  @override
  void initState(BuildContext context) {
    passwordVisibility = false;
    confirmpasswordVisibility = false;
    passwordSignInVisibility = false;
  }

  @override
  void dispose() {
    unfocusNode.dispose();
    authTabBarController?.dispose();
    emailAddressFocusNode?.dispose();
    emailAddressController?.dispose();

    passwordFocusNode?.dispose();
    passwordController?.dispose();

    confirmpasswordFocusNode?.dispose();
    confirmpasswordController?.dispose();

    emailAddressSingInFocusNode?.dispose();
    emailAddressSingInController?.dispose();

    passwordSignInFocusNode?.dispose();
    passwordSignInController?.dispose();
  }

  /// Action blocks are added here.

  /// Additional helper methods are added here.
}
