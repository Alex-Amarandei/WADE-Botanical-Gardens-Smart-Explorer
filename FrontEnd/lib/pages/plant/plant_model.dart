import '/flutter_flow/flutter_flow_util.dart';
import 'plant_widget.dart' show PlantWidget;
import 'package:flutter/material.dart';

class PlantModel extends FlutterFlowModel<PlantWidget> {
  ///  Local state fields for this page.

  bool showMore = true;

  ///  State fields for stateful widgets in this page.

  final unfocusNode = FocusNode();

  /// Initialization and disposal methods.

  @override
  void initState(BuildContext context) {}

  @override
  void dispose() {
    unfocusNode.dispose();
  }

  /// Action blocks are added here.

  /// Additional helper methods are added here.
}
