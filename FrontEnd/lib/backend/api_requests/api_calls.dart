import 'dart:convert';

import '/flutter_flow/flutter_flow_util.dart';
import 'api_manager.dart';

export 'api_manager.dart' show ApiCallResponse;

const _kPrivateApiFunctionName = 'ffPrivateApiCall';

class GetGardenByIdCall {
  static Future<ApiCallResponse> call({
    String? id = 'Gradina Botanica Iasi',
  }) async {
    return ApiManager.instance.makeApiCall(
      callName: 'getGardenById',
      apiUrl:
          'http://botaniqscape.eu-central-1.elasticbeanstalk.com/gardens/$id',
      callType: ApiCallType.GET,
      headers: {},
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      alwaysAllowBody: false,
    );
  }

  static String? gardenId(dynamic response) => castToType<String>(getJsonField(
        response,
        r'''$.partitionKey''',
      ));
  static String? gardenDescription(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.description''',
      ));
  static dynamic gardenLocation(dynamic response) => getJsonField(
        response,
        r'''$.location''',
      );
  static String? gardenCity(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.location.city''',
      ));
  static String? gardenCounty(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.location.county''',
      ));
  static String? gardenCountry(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.location.country''',
      ));
  static String? gardenStreet(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.location.streetName''',
      ));
  static String? gardenPostalCode(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.location.postalCode''',
      ));
  static String? gardenGoogleMapsLink(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.location.googleMapsLink''',
      ));
  static List? gardenEvents(dynamic response) => getJsonField(
        response,
        r'''$.eventList''',
        true,
      ) as List?;
  static String? eventDescription(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.eventList[:].description''',
      ));
  static String? eventDate(dynamic response) => castToType<String>(getJsonField(
        response,
        r'''$.eventList[:].date''',
      ));
  static String? eventLinks(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.eventList[:].socialMediaLink''',
      ));
  static List? gardenExhibitions(dynamic response) => getJsonField(
        response,
        r'''$.exhibitionList''',
        true,
      ) as List?;
  static String? exhibitionSeason(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.exhibitionList[:].season''',
      ));
  static String? exhibitionDescription(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.exhibitionList[:].description''',
      ));
  static List? exhibitionPlants(dynamic response) => getJsonField(
        response,
        r'''$.exhibitionList[:].plantList''',
        true,
      ) as List?;
  static String? plantDescription(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.exhibitionList[:].plantList[:].description''',
      ));
  static String? plantHabit(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.exhibitionList[:].plantList[:].plantHabit''',
      ));
  static String? plantLifeCycle(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.exhibitionList[:].plantList[:].lifeCycle''',
      ));
  static String? plantSoil(dynamic response) => castToType<String>(getJsonField(
        response,
        r'''$.exhibitionList[:].plantList[:].soilPreferences''',
      ));
  static String? plantGardenOrgUrl(dynamic response) =>
      castToType<String>(getJsonField(
        response,
        r'''$.exhibitionList[:].plantList[:].gardenOrgUrl''',
      ));
}

class GetAllGardensSimplifiedCall {
  static Future<ApiCallResponse> call() async {
    return ApiManager.instance.makeApiCall(
      callName: 'getAllGardensSimplified',
      apiUrl: 'http://botaniqscape.eu-central-1.elasticbeanstalk.com/gardens',
      callType: ApiCallType.GET,
      headers: {},
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      alwaysAllowBody: false,
    );
  }

  static List<String>? gardenId(dynamic response) => (getJsonField(
        response,
        r'''$[:].partitionKey''',
        true,
      ) as List?)
          ?.withoutNulls
          .map((x) => castToType<String>(x))
          .withoutNulls
          .toList();
  static List<String>? gardenCity(dynamic response) => (getJsonField(
        response,
        r'''$[:].location.city''',
        true,
      ) as List?)
          ?.withoutNulls
          .map((x) => castToType<String>(x))
          .withoutNulls
          .toList();
  static List<String>? gardenCounty(dynamic response) => (getJsonField(
        response,
        r'''$[:].location.county''',
        true,
      ) as List?)
          ?.withoutNulls
          .map((x) => castToType<String>(x))
          .withoutNulls
          .toList();
  static List<String>? gardenCountry(dynamic response) => (getJsonField(
        response,
        r'''$[:].location.country''',
        true,
      ) as List?)
          ?.withoutNulls
          .map((x) => castToType<String>(x))
          .withoutNulls
          .toList();
  static List<String>? gardenPrice(dynamic response) => (getJsonField(
        response,
        r'''$[:].price''',
        true,
      ) as List?)
          ?.withoutNulls
          .map((x) => castToType<String>(x))
          .withoutNulls
          .toList();
  static List<double>? gardenRating(dynamic response) => (getJsonField(
        response,
        r'''$[:].rating''',
        true,
      ) as List?)
          ?.withoutNulls
          .map((x) => castToType<double>(x))
          .withoutNulls
          .toList();
}

class GetExhibitionByNameAndGardenIdCall {
  static Future<ApiCallResponse> call({
    String? gardenId = 'Gradina Botanica Iasi',
    String? exhibitionName = 'exhibitionName',
  }) async {
    return ApiManager.instance.makeApiCall(
      callName: 'getExhibitionByNameAndGardenId',
      apiUrl:
          'http://botaniqscape.eu-central-1.elasticbeanstalk.com/gardens/$gardenId/exhibitions/$exhibitionName',
      callType: ApiCallType.GET,
      headers: {},
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      alwaysAllowBody: false,
    );
  }
}

class GetSparqlCall {
  static Future<ApiCallResponse> call({
    String? endpoint = 'wikidata',
    String? term = 'American licorice',
  }) async {
    return ApiManager.instance.makeApiCall(
      callName: 'getSparql',
      apiUrl:
          'http://botaniqscape.eu-central-1.elasticbeanstalk.com/sparql/$endpoint/$term',
      callType: ApiCallType.GET,
      headers: {},
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      alwaysAllowBody: false,
    );
  }
}

class ApiPagingParams {
  int nextPageNumber = 0;
  int numItems = 0;
  dynamic lastResponse;

  ApiPagingParams({
    required this.nextPageNumber,
    required this.numItems,
    required this.lastResponse,
  });

  @override
  String toString() =>
      'PagingParams(nextPageNumber: $nextPageNumber, numItems: $numItems, lastResponse: $lastResponse,)';
}

String _serializeList(List? list) {
  list ??= <String>[];
  try {
    return json.encode(list);
  } catch (_) {
    return '[]';
  }
}

String _serializeJson(dynamic jsonVar, [bool isList = false]) {
  jsonVar ??= (isList ? [] : {});
  try {
    return json.encode(jsonVar);
  } catch (_) {
    return isList ? '[]' : '{}';
  }
}
