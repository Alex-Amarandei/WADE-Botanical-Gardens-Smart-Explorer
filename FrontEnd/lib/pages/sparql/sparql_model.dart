import '/backend/api_requests/api_calls.dart';
import '/flutter_flow/flutter_flow_util.dart';
import 'sparql_widget.dart' show SparqlWidget;
import 'package:flutter/material.dart';

class SparqlModel extends FlutterFlowModel<SparqlWidget> {
  ///  Local state fields for this page.

  String? queryResponse = 'Waiting for your call...';

  ///  State fields for stateful widgets in this page.

  final unfocusNode = FocusNode();
  // Stores action output result for [Backend Call - API (getSparql)] action in Container widget.
  ApiCallResponse? sPARQLFlowerResult;
  // Stores action output result for [Backend Call - API (getSparql)] action in Container widget.
  ApiCallResponse? sPARQLTreeResult;
  // Stores action output result for [Backend Call - API (getSparql)] action in Container widget.
  ApiCallResponse? sPARQLFruitResult;
  // State field(s) for TextField widget.
  FocusNode? textFieldFocusNode;
  TextEditingController? textController;
  String? Function(BuildContext, String?)? textControllerValidator;
  // Stores action output result for [Backend Call - API (getSparql)] action in Button widget.
  ApiCallResponse? sPARQLGenericResult;

  /// Initialization and disposal methods.

  @override
  void initState(BuildContext context) {}

  @override
  void dispose() {
    unfocusNode.dispose();
    textFieldFocusNode?.dispose();
    textController?.dispose();
  }

  /// Action blocks are added here.

  /// Additional helper methods are added here.
}
