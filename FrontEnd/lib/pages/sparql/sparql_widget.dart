import '/backend/api_requests/api_calls.dart';
import '/flutter_flow/flutter_flow_animations.dart';
import '/flutter_flow/flutter_flow_icon_button.dart';
import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'package:auto_size_text/auto_size_text.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_animate/flutter_animate.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'sparql_model.dart';
export 'sparql_model.dart';

class SparqlWidget extends StatefulWidget {
  const SparqlWidget({super.key});

  @override
  State<SparqlWidget> createState() => _SparqlWidgetState();
}

class _SparqlWidgetState extends State<SparqlWidget>
    with TickerProviderStateMixin {
  late SparqlModel _model;

  final scaffoldKey = GlobalKey<ScaffoldState>();

  final animationsMap = {
    'containerOnPageLoadAnimation1': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      effects: [
        FadeEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: 0.0,
          end: 1.0,
        ),
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: const Offset(0.0, 110.0),
          end: const Offset(0.0, 0.0),
        ),
      ],
    ),
    'containerOnPageLoadAnimation2': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      effects: [
        FadeEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: 0.0,
          end: 1.0,
        ),
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: const Offset(0.0, 110.0),
          end: const Offset(0.0, 0.0),
        ),
      ],
    ),
    'containerOnPageLoadAnimation3': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      effects: [
        FadeEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: 0.0,
          end: 1.0,
        ),
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: const Offset(0.0, 110.0),
          end: const Offset(0.0, 0.0),
        ),
      ],
    ),
  };

  @override
  void initState() {
    super.initState();
    _model = createModel(context, () => SparqlModel());

    _model.textController ??= TextEditingController(text: 'yellow');
    _model.textFieldFocusNode ??= FocusNode();

    setupAnimations(
      animationsMap.values.where((anim) =>
          anim.trigger == AnimationTrigger.onActionTrigger ||
          !anim.applyInitialState),
      this,
    );
  }

  @override
  void dispose() {
    _model.dispose();

    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    if (isiOS) {
      SystemChrome.setSystemUIOverlayStyle(
        SystemUiOverlayStyle(
          statusBarBrightness: Theme.of(context).brightness,
          systemStatusBarContrastEnforced: true,
        ),
      );
    }

    return GestureDetector(
      onTap: () => _model.unfocusNode.canRequestFocus
          ? FocusScope.of(context).requestFocus(_model.unfocusNode)
          : FocusScope.of(context).unfocus(),
      child: Scaffold(
        key: scaffoldKey,
        backgroundColor: FlutterFlowTheme.of(context).secondaryBackground,
        appBar: AppBar(
          backgroundColor: FlutterFlowTheme.of(context).secondaryBackground,
          automaticallyImplyLeading: false,
          leading: FlutterFlowIconButton(
            borderColor: Colors.transparent,
            borderRadius: 30.0,
            borderWidth: 1.0,
            buttonSize: 60.0,
            icon: Icon(
              Icons.arrow_back_rounded,
              color: FlutterFlowTheme.of(context).primaryText,
              size: 30.0,
            ),
            onPressed: () async {
              context.safePop();
            },
          ),
          title: Text(
            'SPARQL Queries',
            style: FlutterFlowTheme.of(context).titleLarge,
          ),
          actions: const [],
          centerTitle: false,
          elevation: 0.0,
        ),
        body: SafeArea(
          top: true,
          child: Column(
            mainAxisSize: MainAxisSize.max,
            children: [
              Expanded(
                child: Padding(
                  padding:
                      const EdgeInsetsDirectional.fromSTEB(16.0, 12.0, 16.0, 0.0),
                  child: SingleChildScrollView(
                    child: Column(
                      mainAxisSize: MainAxisSize.max,
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          'Welcome to BotaniqScape SPARQL',
                          style: FlutterFlowTheme.of(context).labelLarge,
                        ),
                        Padding(
                          padding: const EdgeInsetsDirectional.fromSTEB(
                              0.0, 4.0, 0.0, 0.0),
                          child: Text(
                            'Let\'s gain some knowledge!',
                            style: FlutterFlowTheme.of(context).headlineMedium,
                          ),
                        ),
                        Row(
                          mainAxisSize: MainAxisSize.max,
                          children: [
                            Expanded(
                              child: Padding(
                                padding: const EdgeInsetsDirectional.fromSTEB(
                                    0.0, 16.0, 0.0, 0.0),
                                child: InkWell(
                                  splashColor: Colors.transparent,
                                  focusColor: Colors.transparent,
                                  hoverColor: Colors.transparent,
                                  highlightColor: Colors.transparent,
                                  onTap: () async {
                                    _model.sPARQLFlowerResult =
                                        await GetSparqlCall.call(
                                      endpoint: 'dbpedia',
                                      term: 'flower',
                                    );
                                    _model.queryResponse =
                                        valueOrDefault<String>(
                                      (_model.sPARQLFlowerResult?.bodyText ??
                                          ''),
                                      'Name: Calabash URL: http://dbpedia.org/resource/Calabash Description: Calabash (/ˈkæləbæʃ/; Lagenaria siceraria), also known as bottle gourd, white-flowered gourd, long melon, birdhouse gourd, New Guinea bean, Tasmania bean, and opo squash, is a vine grown for its fruit. It can be either harvested young to be consumed as a vegetable, or harvested mature to be dried and used as a utensil, container, or a musical instrument. When it is fresh, the fruit has a light green smooth skin and white flesh. Calabash fruits have a variety of shapes: they can be huge and rounded, small and bottle-shaped, or slim and serpentine, and they can grow to be over a metre long. Rounder varieties are typically called calabash gourds. The gourd was one of the world\'s first cultivated plants grown not primarily for food, but for use as containers. The bottle gourd may have been carried from Asia to Africa, Europe, and the Americas in the course of human migration, or by seeds floating across the oceans inside the gourd. It has been proven to have been globally domesticated (and existed in the New World) during the Pre-Columbian era. Because bottle gourds are also called "calabashes", they are sometimes confused with the hard, hollow fruits of the unrelated calabash tree (Crescentia cujete), whose fruits are also used to make utensils, containers, and musical instruments.  Name: Calamintha grandiflora URL: http://dbpedia.org/resource/Calamintha_grandiflora Description: Calamintha grandiflora, the large-flowered calamint, showy calamint or mint savory, is a species of ornamental plant.  Name: Calceolaria cana URL: http://dbpedia.org/resource/Calceolaria_cana Description: Calceolaria cana, the salsilla or zarcilla, is a species of flowering plant in the pocketbook plant genus Calceolaria, family Calceolariaceae, native to central Chile. Along with and Calceolaria crenatiflora it has contributed to the Calceolaria Herbeohybrida Group of cultivars.  Name: Calea ternifolia URL: http://dbpedia.org/resource/Calea_ternifolia Description: Calea ternifolia (syn. Calea zacatechichi) is a species of flowering plant in the aster family, Asteraceae. It is native to Mexico and Central America. Its English language common names include bitter-grass, Mexican calea, and dream herb. It is used in traditional medicine and ritual in its native range.  Name: Calendula arvensis URL: http://dbpedia.org/resource/Calendula_arvensis Description: Calendula arvensis is a species of flowering plant in the daisy family known by the common name field marigold. It is native to central and southern Europe, and it is known across the globe as an introduced species. Calendula arvensis is an annual or biennial herb 10 to 50 cm (3.9 to 19.7 in) tall. The leaves are lance-shaped and borne on petioles from the slender, hairy stem. The inflorescence is a single flower head up to four centimeters wide with bright yellow to yellow-orange ray florets around a center of yellow disc florets. The fruit is an achene which can take any of three shapes, including ring-shaped, that facilitate different methods of dispersal.  Name: Calliandra URL: http://dbpedia.org/resource/Calliandra Description: Calliandra is a genus of flowering plants in the pea family, Fabaceae, in the mimosoid clade of the subfamily Caesalpinioideae. It contains about 140 species that are native to tropical and subtropical regions of the Americas.  Name: Calochortoideae URL: http://dbpedia.org/resource/Calochortoideae Description: The Calochortoideae are a subfamily of monocotyledon perennial, herbaceous and mainly bulbous flowering plants in the lily family, Liliaceae.Approximately the same group of species has been recognized as a separate family, Calochortaceae, in a few systems of plant taxonomy, including the Dahlgren system. They are found predominantly in the temperate regions of the Northern Hemisphere, particularly East Asia and North America.  Name: Calochortus URL: http://dbpedia.org/resource/Calochortus Description: Calochortus /ˌkæləˈkɔːrtəs, -loʊ-/ is a genus of flowering plants in the lily family. The group includes herbaceous, perennial and bulbous species, all native to North America (primarily the Western United States). The genus Calochortus includes mariposas (or mariposa lilies) with open wedge-shaped petals, globe lilies and fairy lanterns with globe-shaped flowers, and cat\'s ears and star tulips with erect pointed petals. The word Calochortus is derived from Greek and means "beautiful grass".  Name: Calophyllum URL: http://dbpedia.org/resource/Calophyllum Description: Calophyllum is a genus of tropical flowering plants in the family Calophyllaceae. They are mainly distributed in Asia, with some species in Africa, the Americas, Australasia, and the Pacific Islands.  Name: Caltha URL: http://dbpedia.org/resource/Caltha Description: Caltha is a genus of rhizomatous perennial flowering plants in the family Ranunculaceae ("buttercup family"), to which ten species have been assigned. They occur in moist environments in temperate and cold regions of both the Northern and Southern Hemispheres. Their leaves are generally heart-shaped or kidney-shaped, or are characteristically diplophyllous (the auricles of the leaf blades form distinctly inflexed appendages). Flowers are star shaped and mostly yellow to white. True petals and nectaries are missing but the five or more sepals are distinctly colored. As usual in the buttercup family there is a circle of stamens around (two to twenty-five) free carpels.',
                                    );

                                    setState(() {});
                                  },
                                  child: Container(
                                    width: 120.0,
                                    constraints: const BoxConstraints(
                                      maxWidth: 500.0,
                                    ),
                                    decoration: BoxDecoration(
                                      color: FlutterFlowTheme.of(context)
                                          .secondaryBackground,
                                      borderRadius: BorderRadius.circular(12.0),
                                      border: Border.all(
                                        color: FlutterFlowTheme.of(context)
                                            .alternate,
                                        width: 2.0,
                                      ),
                                    ),
                                    child: Padding(
                                      padding: const EdgeInsets.all(8.0),
                                      child: Column(
                                        mainAxisSize: MainAxisSize.max,
                                        mainAxisAlignment:
                                            MainAxisAlignment.center,
                                        crossAxisAlignment:
                                            CrossAxisAlignment.center,
                                        children: [
                                          Icon(
                                            Icons.emoji_nature,
                                            color: FlutterFlowTheme.of(context)
                                                .primary,
                                            size: 36.0,
                                          ),
                                          Padding(
                                            padding:
                                                const EdgeInsetsDirectional.fromSTEB(
                                                    0.0, 12.0, 0.0, 0.0),
                                            child: Text(
                                              'Flower',
                                              textAlign: TextAlign.center,
                                              style:
                                                  FlutterFlowTheme.of(context)
                                                      .bodyMedium,
                                            ),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ),
                                ).animateOnPageLoad(animationsMap[
                                    'containerOnPageLoadAnimation1']!),
                              ),
                            ),
                            Expanded(
                              child: Padding(
                                padding: const EdgeInsetsDirectional.fromSTEB(
                                    0.0, 16.0, 0.0, 0.0),
                                child: InkWell(
                                  splashColor: Colors.transparent,
                                  focusColor: Colors.transparent,
                                  hoverColor: Colors.transparent,
                                  highlightColor: Colors.transparent,
                                  onTap: () async {
                                    _model.sPARQLTreeResult =
                                        await GetSparqlCall.call(
                                      endpoint: 'dbpedia',
                                      term: 'oak',
                                    );
                                    _model.queryResponse =
                                        valueOrDefault<String>(
                                      (_model.sPARQLTreeResult?.bodyText ?? ''),
                                      'Name: Calvos Oak URL: http://dbpedia.org/resource/Calvos_Oak Description: The Calvos Oak (Portuguese: Carvalho de Calvos) is a European oak located in the parish of Calvos, in Póvoa de Lanhoso, Portugal. It is estimated to be about 510 years old, as of 2015 it stands 30 m (98 ft) tall and had a diameter at breast height of 7.62 m (25 ft) with a canopy diameter of 37 m (121 ft). It is considered to be the oldest oak in the Iberian Peninsula.  Name: Casuarina pauper URL: http://dbpedia.org/resource/Casuarina_pauper Description: Casuarina pauper is a tree from the family Casuarinaceae, native to a band across the drier, inland areas of southern Australia. C. pauper is known as a poorer, stunted form of the closely related Casuarina cristata.Common names include black oak and belah.  Name: Amorpha californica URL: http://dbpedia.org/resource/Amorpha_californica Description: Amorpha californica is a species of flowering plant in the legume family known by the common name California false indigo. It is native to California, Arizona, and northern Baja California, where it grows in the California chaparral and woodlands and other chaparral and oak woodlands habitats. It is generally considered an understory plant.  Name: Amsinckia tessellata URL: http://dbpedia.org/resource/Amsinckia_tessellata Description: Amsinckia tessellata is a species of fiddleneck known by the common names bristly fiddleneck, tessellate fiddleneck, checker fiddleneck, and devil\'s lettuce. The plant is native to dry regions of western North America, more specifically eastern Washington and Idaho, much of California and the Great Basin, to southwest New Mexico (U.S.) and northwest Sonora and Baja California in Mexico, usually below 6,000 feet (1,800 m) elevation. It is a common plant in many types of habitats, including chaparral, oak woodland, xeric scrub, temperate valleys, disturbed areas, and deserts including the Mojave Desert and Sonoran Desert.  Name: Bażyński Oak URL: http://dbpedia.org/resource/Bażyński_Oak Description: The Bażyński Oak is an oak tree and natural monument in Poland. It is one of the oldest trees in Poland, whose age is estimated at around 716 years according to dendrochronological research. It grows in the town of Kadyny on the Vistula Lagoon. The circumference of the tree is 10.03 metres and its height is 21 metres. The crown spread is 14 by 21.5 m. The Bażyński Oak\'s circumference near the ground is exceptional – around 15 metres. It is named after Jan Bażyński (also known as Johannes von Baysen), a former owner of Kadyny and one of the founders of the Prussian Confederation. In 1880 the oak\'s trunk was 8.64 metres thick and the radius of its crown was 13 metres; at the time its large hollow was fitted with a wooden door and a guard was posted to protect it. One of the owners of Kadyny, Artur Brikner, claimed that eleven soldiers could stay in the hollow trunk. What is more, in the first years of the 20th century, the trunk was part of the brew (beer) pub and the currency exchange. The area around the Bażyński Oak also includes six other old oaks which are also on the registry of Polish national monuments.  Name: Beaman Oak URL: http://dbpedia.org/resource/Beaman_Oak Description: The Beaman Oak was the largest white oak tree in the Commonwealth of Massachusetts. It stood in the front yard of a colonial era three-story house in the town of Lancaster. It was so named because Gamaliel Beaman had originally settled the spot in 1659. The oak became known as a prominent landmark in Central Massachusetts and is featured prominently on the town seal of West Boylston. In 1970, the Beaman Oak\'s circumference at its base was 31 ft (9.4 m), with a circumference 5 ft (1.5 m) above the base of 31 ft (9.4 m), and its height was 75 ft (23 m) and spread was 75 ft (23 m). The oak\'s trunk was partially hollow towards the end of its life. After a storm severely damaged it, the tree was cut down in 1989.  Name: Begonia cubensis URL: http://dbpedia.org/resource/Begonia_cubensis Description: Begonia cubensis, also known as Cuban holly, is a species of perennial plant that belongs to the Begoniaceae. It is native to Cuba and its habit is an understory shrub. Its habitat range is from moist subtropical to tropical climates. Begonia cubensis is known for its colorful flowers and attractive leaves. It has small wavy gray/green leaves and short, thin semi-woody stems. It grows in humid and hot places on a wide range of well-drained soils, from sand to clay loam. The plants are monoecious.Slugs, snails and caterpillars eat the leaves of Begonia cubensis. Aphids can infest Begonia cubensis causing the leaves to wilt. In many places people eat local species of Begonia. However, Begonia cubensis has a bitter taste; therefore it is not preferred among other species of the same family. Begonia cubensis are known to have a laxative effect and they are used for medicinal purposes. Medicinal mixtures can be prepared in different ways. A mixture made by soaking the flowers in hot water helps to eradicate headaches and relive the body of toxins. The crushed flowers and leaves can also be rubbed directly on the skin to help alleviate pain and cure sores or burns.  Name: Bellefield Boiler Plant URL: http://dbpedia.org/resource/Bellefield_Boiler_Plant Description: Bellefield Boiler Plant, also known as "The Cloud Factory" from its nickname\'s use in Michael Chabon\'s 1988 debut novel The Mysteries of Pittsburgh, is a boiler plant located in Junction Hollow (referred to as "The Lost Neighborhood" in Chabon\'s book) between the Carnegie Institute of Pittsburgh and Carnegie Mellon University in the Oakland district of Pittsburgh, Pennsylvania. Built in 1907 to provide steam heat for Carnegie Museum, it was designed in the Romanesque Revival style by the architectural firm Longfellow, Alden & Harlow. The 1907 smoke stack measured 150 feet (removed in 2010), and the newer stack (unknown built year) is more than 200 feet. The plant has burned both coal and natural gas but stopped burning coal on July 1, 2009. Its steam system expanded in the 1930s to service the University of Pittsburgh\'s Cathedral of Learning. Today it pumps heat to most of the major buildings in Oakland. It is owned by a consortium made up of the University of Pittsburgh, University of Pittsburgh Medical Center, Carnegie Mellon University, the Carnegie Museum, the City of Pittsburgh, and the Pittsburgh Public Schools. During its coal burning years, the plant could consume up to a 70-ton hopper car of coal per day, delivered by the (now in the P&W Subdivision of CSX) that ran through Junction Hollow next to the plant. The plant\'s small 1942 Plymouth DE 25T locomotive would shuttle the cars between the siding and the plant via a wooden trestle bridge (demolished 2012) spanning Boundary Street. According to reporting by the Pittsburgh Post-Gazette the 2007 film The Mysteries of Pittsburgh does not use the actual Bellefield Boiler Plant, but instead uses what remains of the Carrie Furnace, a storied blast furnace that was part of US Steel\'s Homestead Works, a few miles south in Swissvale, Pennsylvania.  Name: Pow-Wow Oak Tree URL: http://dbpedia.org/resource/Pow-Wow_Oak_Tree Description: The Pow-Wow Oak is an historic tree located in the Belvidere neighborhood of Lowell, Massachusetts. ("Belvidere" means "beautiful to behold" in the Italian language.) This 300-year-old tree is believed to have served as a gathering place for pow wows held by the Native American Wamesit tribe. ("Wamesit" is an Algonquian word meaning: "a cornucopia of plenty for all.") The Wamesit Indians congregated in this area for thousands of years, and the land on which this tree grew on (which was high ground with an underground spring close by) was held as sacred to them as was the tree itself. It is also said that Revolutionary War soldiers such as Deacon Thomas Clark, Captain John Trull, and General Joseph Varnum, as well as others from this New England hamlet, traveled past the Pow-Wow Oak on their way to defend Lexington and Concord on Patriots Day, April 19, 1775. This was the very beginning of the American Revolution, which started in the Commonwealth of Massachusetts. In 1909, Middlesex County decided to pave Clark Road, then a dirt and gravel road that was referred to as "The Old Bridal Path". Albert E. O\'Heir, an immigrant from Canada, who lived in the old Hunt Home at 241 Clark Road, did not want to see the tree, which stood in the middle of the road, cut down. In order that the tree might stand, O\'Heir donated for one cent to the City of Lowell, 9,463 square feet of his land on Clark Road. In May 1931, the Molly Varnum Chapter of the Massachusetts Daughters of the American Revolution (DAR) erected a sign next to the tree to commemorate the ancient oak, the Wamesit Indians, and the local militia who passed by it while traveling through that Lowell neighborhood (then still part of the town of Tewksbury) during the Revolutionary War. In September, 2009, a local, grass-roots, neighborhood, environmental organization called the Pow-Wow Oak Protectors (a registered, non-profit, public-charity), founded by George Nicholas Koumantzelis, was formed to ensure the continued safety of the tree, as it had been encroached upon for decades, doing damage to its health. In May 2011, local groups, including a current chapter of the Old Concord DAR and the Pow-Wow Oak Protectors, raised funds to have the tree\'s commemorative sign refurbished. The Pow-Wow Oak has also been recognized and preserved by the American Forests Historic Trees Program, and by the City of Lowell via the Pow Wow Oak Tree Preservation Covenant, which was recorded on March 12, 2012, at the Middlesex (North District) Registry of Deeds, Book 25799, Page 105. In May 2011, a documentary movie called "The Last Pow-Wow Oak" about the Pow-Wow Oak and the crusade to save it by the Pow-Wow Oak Protectors, as well as other, local, concerned groups, was produced and released by local artist, musician, film maker, and documentarian, Andrew Szava-Kovats. In March 2014, an accompanying book (with the same title) to the movie, including more detailed legal documents and historical data about the whole Pow-Wow Oak saga, was written and produced by Andrew Szava-Kovats. On May 21, 2013, during a very strong wind storm, a large upper branch (not the lower horizontal "arm" that pointed west) of the Pow-Wow Oak collapsed onto nearby Clark Road. The following day, the decision was made by the City Manager\'s Office of the City of Lowell to, questionably, cut down the entire tree to the ground because extensive interior decay in the mid to upper sections of the tree had more than partially compromised the tree and the safety of pedestrians and nearby motorists. On Thursday, November 12, 2015, a dedication ceremony was held at the Peter W. Reilly Elementary School on Douglas Road in Lowell, MA, commemorating the installation of a permanent display of a huge round piece of the trunk of the Pow-Wow Oak.  Name: Queen Elizabeth Oak URL: http://dbpedia.org/resource/Queen_Elizabeth_Oak Description: The Queen Elizabeth Oak is a large sessile oak tree in Cowdray Park near the village of Lodsworth in the Western Weald, West Sussex, England. It lies within the South Downs National Park. It has a girth of 12.5–12.8 metres (41–42 ft), and is about 800–1,000 years old. According to this estimate it began to grow in the 11th or 12th century AD. In June 2002, The Tree Council designated the Queen Elizabeth Oak, one of fifty Great British Trees, in recognition of its place in the national heritage. According to the Woodland Trust, the tree is the third largest sessile oak tree to be recorded in the United Kingdom after the Pontfadog Oak in Wales and the Marton Oak in Cheshire, although this tree is now fragmented. According to legend, Queen Elizabeth I stood with an arrow ready in her bow waiting for a stag to be driven within range for her to shoot it, although she was unsuccessful.',
                                    );

                                    setState(() {});
                                  },
                                  child: Container(
                                    width: 120.0,
                                    constraints: const BoxConstraints(
                                      maxWidth: 500.0,
                                    ),
                                    decoration: BoxDecoration(
                                      color: FlutterFlowTheme.of(context)
                                          .secondaryBackground,
                                      borderRadius: BorderRadius.circular(12.0),
                                      border: Border.all(
                                        color: FlutterFlowTheme.of(context)
                                            .alternate,
                                        width: 2.0,
                                      ),
                                    ),
                                    child: Padding(
                                      padding: const EdgeInsets.all(8.0),
                                      child: Column(
                                        mainAxisSize: MainAxisSize.max,
                                        mainAxisAlignment:
                                            MainAxisAlignment.center,
                                        crossAxisAlignment:
                                            CrossAxisAlignment.center,
                                        children: [
                                          FaIcon(
                                            FontAwesomeIcons.tree,
                                            color: FlutterFlowTheme.of(context)
                                                .primary,
                                            size: 36.0,
                                          ),
                                          Padding(
                                            padding:
                                                const EdgeInsetsDirectional.fromSTEB(
                                                    0.0, 12.0, 0.0, 0.0),
                                            child: Text(
                                              'Tree',
                                              textAlign: TextAlign.center,
                                              style:
                                                  FlutterFlowTheme.of(context)
                                                      .bodyMedium,
                                            ),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ),
                                ).animateOnPageLoad(animationsMap[
                                    'containerOnPageLoadAnimation2']!),
                              ),
                            ),
                            Expanded(
                              child: Padding(
                                padding: const EdgeInsetsDirectional.fromSTEB(
                                    0.0, 16.0, 0.0, 0.0),
                                child: InkWell(
                                  splashColor: Colors.transparent,
                                  focusColor: Colors.transparent,
                                  hoverColor: Colors.transparent,
                                  highlightColor: Colors.transparent,
                                  onTap: () async {
                                    _model.sPARQLFruitResult =
                                        await GetSparqlCall.call(
                                      endpoint: 'dbpedia',
                                      term: 'berries',
                                    );
                                    _model.queryResponse =
                                        valueOrDefault<String>(
                                      (_model.sPARQLFruitResult?.bodyText ??
                                          ''),
                                      'Name: Amelanchier sanguinea URL: http://dbpedia.org/resource/Amelanchier_sanguinea Description: Amelanchier sanguinea, known as red-twigged shadbush or roundleaf serviceberry, is a shrub native to eastern and central North America. Its native range stretches from New Brunswick to Saskatchewan south as far as northern Georgia. It is most common in eastern Canada, the northeastern United States, and the Great Lakes region. Amelanchier sanguinea is a shrub that can grow up to 3 metres (9.8 ft) tall, and has edible sweet-flavored fruits that are red when young and become purple or dark-blue when they ripen. Like all Amelanchier fruit, these resemble berries, but are technically pomes. Varieties  * Amelanchier sanguinea var. gaspensis Wiegand  * Amelanchier sanguinea var. grandiflora (Wiegand) Rehder  * Amelanchier sanguinea var. sanguinea  * Akureyri Botanical Gardens, Iceland  Name: Amorphophallus titanum URL: http://dbpedia.org/resource/Amorphophallus_titanum Description: Amorphophallus titanum, the titan arum, is a flowering plant in the family Araceae. It has the largest unbranched inflorescence in the world. The inflorescence of the talipot palm, Corypha umbraculifera, is larger, but it is branched rather than unbranched. A. titanum is endemic to rainforests on the Indonesian island of Sumatra. Due to its odor, like that of a rotting corpse, the titan arum is characterized as a carrion flower, and is also known as the corpse flower or corpse plant (Indonesian: bunga bangkai—bunga means flower, while bangkai can be translated as corpse, cadaver, or carrion). The titan arum\'s berries arrange in a regular cylindrical form that resembles the packing of spheres inside a cylindrical confinement. Those structures are also called columnar structures or crystals.  Name: Belle de Fontenay URL: http://dbpedia.org/resource/Belle_de_Fontenay Description: Belle de Fontenay is a small fingerling potato variety with yellow skin and yellow flesh. This heirloom variety was released in France in 1885. This variety has a firm, waxy texture and is suitable for salads and soup. This variety has a long shaped tuber with a shallow eye depth and smooth skin. The colour of the base of the light sprout is blue, the maturity is first early, the flowers are a blue violet colour and there are no berries on the plant of this species.  Name: Pouteria obovata URL: http://dbpedia.org/resource/Pouteria_obovata Description: Pouteria obovata is a tree in the family Sapotaceae. Confusingly, this is not the same plant that was formerly known by the same scientific name, the Andean Pouteria lucuma. The common name in Australia is the northern yellow boxwood. It occurs in many parts of south-east Asia, Micronesia, and on islands of the Indian Ocean, and has local common names there. The tree was first described as Sersalisia obovata by Robert Brown in his 1810 work Prodromus Florae Novae Hollandiae, before being moved to its current binomial name by Baehni in 1942. The specific epithet obovata refers to the reverse ovate shape of the leaf. There is discussion whether this plant should remain named as Planchonella obovata, with the Queensland herbarium supporting this. A genetic analysis of material found that material from Papua New Guinea was isolated and was a sister to a group comprising material from Australia and Indonesia. Indumentum was present on the leaf surface of the Australian and Indonesian samples, and absent in material from Papua New Guinea. Pouteria obovata grows as a bushy-crowned tree reaching a maximum height of 10 to 20 metres (33 to 66 ft). The leaves hairy when young, with upper surfaces becoming smooth and shiny. They are roughly oval- to spear-shaped and measure 6–24 cm (2.5–9.5 in) long, and 1.5–15 cm (0.59–5.91 in) wide. Appearing from August to October, the tiny greenish-white flowers grow in clusters. Flowering is followed by round red or blue berries 1–1.5 cm (0.39–0.59 in) in diameter. Each berry contains one to five seeds which are yellow when ripe. It can be grown in conditions with good drainage with sunny aspect, and can be propagated by seed. The wood is used for turning and cabinet-making.  *  *  *  Name: Eleutherococcus gracilistylus URL: http://dbpedia.org/resource/Eleutherococcus_gracilistylus Description: Eleutherococcus gracilistylus, also known as Acanthopanax gracilistylus, is deciduous plant with dark blue berries. It is considered a medicinal herb with significant effects. A widely used Chinese plant, it is in the family Araliaceae, and mainly grows at an altitude of around 3000 m. It is also found in Gaoligongshan Nature Reserve in Yunnan Province, China. It is widely distributed in China and has been used as a life-saving medicine against severe cases of paralysis, arthritis and liver disease; several experiments were carried out in 2003.  Name: Merlot URL: http://dbpedia.org/resource/Merlot Description: Merlot is a dark blue–colored wine grape variety, that is used as both a blending grape and for varietal wines. The name Merlot is thought to be a diminutive of merle, the French name for the blackbird, probably a reference to the color of the grape. Its softness and "fleshiness," combined with its earlier ripening, make Merlot a popular grape for blending with the sterner, later-ripening Cabernet Sauvignon, which tends to be higher in tannin. Along with Cabernet Sauvignon, Cabernet Franc, Malbec and Petit Verdot, Merlot is one of the primary grapes used in Bordeaux wine, and it is the most widely planted grape in the Bordeaux wine regions. Merlot is also one of the most popular red wine varietals in many markets. This flexibility has helped to make it one of the world\'s most planted grape varieties. As of 2004, Merlot was estimated to be the third most grown variety at 260,000 hectares (640,000 acres) globally.The area planted to Merlot has continued to increase, with 266,000 hectares (660,000 acres) in 2015. While Merlot is made across the globe, there tend to be two main styles. The "International style" favored by many New World wine regions tends to emphasize late harvesting to gain physiological ripeness and produce inky, purple colored wines that are full in body with high alcohol and lush, velvety tannins with intense, plum and blackberry fruit. While this international style is practiced by many Bordeaux wine producers, the traditional "Bordeaux style" of Merlot involves harvesting Merlot earlier. This maintains the acidity and produces more medium-bodied wines with moderate alcohol levels that have fresh, red fruit flavors (raspberries, strawberries) and potentially leafy, vegetal notes.  Name: Melicytus dentatus URL: http://dbpedia.org/resource/Melicytus_dentatus Description: Melicytus dentatus, the tree violet, is a shrub that is native to south-east Australia. It grows up to 4 metres high and has branchlets that are often armed with spines and have leaves that are 5 to 50 mm long and sometimes toothed. The flowers appear in spring and summer and are pale yellow, 3 to 5 mm in length, and have petals that are recurved at the tips. These are followed by pale green to purple-black, rounded berries which are 4 to 5 mm in diameter. The berries are consumed by Cunningham\'s spiny-tailed skinks. The species occurs in New South Wales, Victoria, Tasmania and South Australia.  Name: Memecylon grande URL: http://dbpedia.org/resource/Memecylon_grande Description: Memecylon grande is a species of plant in the family Melastomataceae seen in Indo-Malesia. It is a shrub or small tree with ovate leaves, blue flowers and fruits are berries.  Name: Moristel URL: http://dbpedia.org/resource/Moristel Description: Moristel is a minor Spanish red grape variety. It is mainly found in the autonomous region of Aragon and is one of the authorized varieties of the Somontano Denominación de Origen (DO). It has medium-sized, compact bunches with medium-sized, cylindrical-shaped berries with a blue hue. Traditionally it has been used for blending with other varieties to add body and colour to the wine.  Name: Phytolacca pruinosa URL: http://dbpedia.org/resource/Phytolacca_pruinosa Description: Phytolacca pruinosa, the Levantine pokeweed, is a species of plant in the Phytolaccaceae family. It is a perennial bearing green flowers which become red on maturity. Fruits are black berries.',
                                    );

                                    setState(() {});
                                  },
                                  child: Container(
                                    width: 120.0,
                                    constraints: const BoxConstraints(
                                      maxWidth: 500.0,
                                    ),
                                    decoration: BoxDecoration(
                                      color: FlutterFlowTheme.of(context)
                                          .secondaryBackground,
                                      borderRadius: BorderRadius.circular(12.0),
                                      border: Border.all(
                                        color: FlutterFlowTheme.of(context)
                                            .alternate,
                                        width: 2.0,
                                      ),
                                    ),
                                    child: Padding(
                                      padding: const EdgeInsets.all(8.0),
                                      child: Column(
                                        mainAxisSize: MainAxisSize.max,
                                        mainAxisAlignment:
                                            MainAxisAlignment.center,
                                        crossAxisAlignment:
                                            CrossAxisAlignment.center,
                                        children: [
                                          Icon(
                                            Icons.apple,
                                            color: FlutterFlowTheme.of(context)
                                                .primary,
                                            size: 36.0,
                                          ),
                                          Padding(
                                            padding:
                                                const EdgeInsetsDirectional.fromSTEB(
                                                    0.0, 12.0, 0.0, 0.0),
                                            child: Text(
                                              'Fruit',
                                              textAlign: TextAlign.center,
                                              style:
                                                  FlutterFlowTheme.of(context)
                                                      .bodyMedium,
                                            ),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ),
                                ).animateOnPageLoad(animationsMap[
                                    'containerOnPageLoadAnimation3']!),
                              ),
                            ),
                          ].divide(const SizedBox(width: 12.0)),
                        ),
                        Padding(
                          padding: const EdgeInsetsDirectional.fromSTEB(
                              0.0, 12.0, 0.0, 4.0),
                          child: Text(
                            'Click on the pre-made queries above, or create one yourself below:',
                            style: FlutterFlowTheme.of(context).labelLarge,
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsetsDirectional.fromSTEB(
                              0.0, 20.0, 0.0, 0.0),
                          child: Container(
                            width: MediaQuery.sizeOf(context).width * 1.0,
                            height: MediaQuery.sizeOf(context).height * 0.15,
                            decoration: BoxDecoration(
                              color: FlutterFlowTheme.of(context)
                                  .secondaryBackground,
                              boxShadow: const [
                                BoxShadow(
                                  blurRadius: 4.0,
                                  color: Color(0x33000000),
                                  offset: Offset(0.0, 2.0),
                                )
                              ],
                              borderRadius: BorderRadius.circular(10.0),
                            ),
                            child: Padding(
                              padding: const EdgeInsetsDirectional.fromSTEB(
                                  20.0, 20.0, 20.0, 0.0),
                              child: Column(
                                mainAxisSize: MainAxisSize.max,
                                children: [
                                  Align(
                                    alignment: const AlignmentDirectional(-1.0, 0.0),
                                    child: Text(
                                      'I want all plants that are...',
                                      textAlign: TextAlign.start,
                                      style: FlutterFlowTheme.of(context)
                                          .labelMedium,
                                    ),
                                  ),
                                  Padding(
                                    padding: const EdgeInsetsDirectional.fromSTEB(
                                        20.0, 0.0, 20.0, 0.0),
                                    child: TextFormField(
                                      controller: _model.textController,
                                      focusNode: _model.textFieldFocusNode,
                                      autofocus: true,
                                      obscureText: false,
                                      decoration: InputDecoration(
                                        labelStyle: FlutterFlowTheme.of(context)
                                            .labelMedium,
                                        hintStyle: FlutterFlowTheme.of(context)
                                            .labelMedium,
                                        enabledBorder: UnderlineInputBorder(
                                          borderSide: BorderSide(
                                            color: FlutterFlowTheme.of(context)
                                                .alternate,
                                            width: 2.0,
                                          ),
                                          borderRadius:
                                              BorderRadius.circular(8.0),
                                        ),
                                        focusedBorder: UnderlineInputBorder(
                                          borderSide: BorderSide(
                                            color: FlutterFlowTheme.of(context)
                                                .primary,
                                            width: 2.0,
                                          ),
                                          borderRadius:
                                              BorderRadius.circular(8.0),
                                        ),
                                        errorBorder: UnderlineInputBorder(
                                          borderSide: BorderSide(
                                            color: FlutterFlowTheme.of(context)
                                                .error,
                                            width: 2.0,
                                          ),
                                          borderRadius:
                                              BorderRadius.circular(8.0),
                                        ),
                                        focusedErrorBorder:
                                            UnderlineInputBorder(
                                          borderSide: BorderSide(
                                            color: FlutterFlowTheme.of(context)
                                                .error,
                                            width: 2.0,
                                          ),
                                          borderRadius:
                                              BorderRadius.circular(8.0),
                                        ),
                                        contentPadding:
                                            const EdgeInsetsDirectional.fromSTEB(
                                                20.0, 0.0, 0.0, 0.0),
                                      ),
                                      style: FlutterFlowTheme.of(context)
                                          .bodyMedium,
                                      validator: _model.textControllerValidator
                                          .asValidator(context),
                                    ),
                                  ),
                                ],
                              ),
                            ),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsetsDirectional.fromSTEB(
                              0.0, 20.0, 0.0, 0.0),
                          child: Container(
                            width: MediaQuery.sizeOf(context).width * 1.0,
                            decoration: BoxDecoration(
                              color: FlutterFlowTheme.of(context)
                                  .secondaryBackground,
                              boxShadow: const [
                                BoxShadow(
                                  blurRadius: 4.0,
                                  color: Color(0x33000000),
                                  offset: Offset(0.0, 2.0),
                                )
                              ],
                              borderRadius: BorderRadius.circular(10.0),
                            ),
                            child: Padding(
                              padding: const EdgeInsetsDirectional.fromSTEB(
                                  20.0, 20.0, 20.0, 20.0),
                              child: AutoSizeText(
                                valueOrDefault<String>(
                                  _model.queryResponse,
                                  'Waiting for your call...',
                                ),
                                textAlign: TextAlign.start,
                                style: FlutterFlowTheme.of(context)
                                    .bodyMedium
                                    .override(
                                      fontFamily: 'Readex Pro',
                                      lineHeight: 1.5,
                                    ),
                              ),
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
              Padding(
                padding: const EdgeInsetsDirectional.fromSTEB(16.0, 16.0, 16.0, 12.0),
                child: FFButtonWidget(
                  onPressed: () async {
                    _model.sPARQLGenericResult = await GetSparqlCall.call(
                      endpoint: 'dbpedia',
                      term: _model.textController.text,
                    );
                    setState(() {
                      _model.queryResponse = valueOrDefault<String>(
                        (_model.sPARQLGenericResult?.bodyText ?? ''),
                        'Name: Bee tree URL: http://dbpedia.org/resource/Bee_tree Description: A bee tree is a tree in which a colony of honey bees makes its home. A colony of bees may live in a bee tree for many years. Most bee trees have a large inner hollow, often with an upper and lower entrance. Colonies in trees have fixed comb, so inspection and management is impossible, as is most harvesting without destroying the colony. A beekeeper can perform a cut-out on a gum hive. The trunk is cut open to expose the cavity, and the comb is carefully removed and strapped into standard frames. The frames are then put to a conventional hive, such as a Langstroth hive. The bees will follow into the new hive especially if the queen and brood can be transferred. If the tree is cut down and the trunk section containing the colony is removed, the result is a log gum or gum hive. A log gum is essentially a bee tree cut into a short section that contained a colony of honey bees. It got its name from the fact that when gum trees die they rot from the inside out, thereby creating a large cavity in which bees would commonly nest. These hives are fixed comb hives and, therefore, medicating and inspecting is almost impossible. ',
                      );
                    });

                    setState(() {});
                  },
                  text: 'Query',
                  icon: const Icon(
                    Icons.search,
                    size: 15.0,
                  ),
                  options: FFButtonOptions(
                    width: double.infinity,
                    height: 48.0,
                    padding: const EdgeInsets.all(0.0),
                    iconPadding:
                        const EdgeInsetsDirectional.fromSTEB(0.0, 0.0, 0.0, 0.0),
                    color: FlutterFlowTheme.of(context).primary,
                    textStyle: FlutterFlowTheme.of(context).titleMedium,
                    elevation: 3.0,
                    borderSide: const BorderSide(
                      color: Colors.transparent,
                      width: 1.0,
                    ),
                    borderRadius: BorderRadius.circular(60.0),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
