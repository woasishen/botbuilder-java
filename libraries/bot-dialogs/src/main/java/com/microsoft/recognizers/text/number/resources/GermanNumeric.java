// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// ------------------------------------------------------------------------------

package com.microsoft.recognizers.text.number.resources;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class GermanNumeric {

    public static final String LangMarker = "Ger";

    public static final Boolean CompoundNumberLanguage = true;

    public static final Boolean MultiDecimalSeparatorCulture = false;

    public static final String ZeroToNineIntegerRegex = "(drei|sieben|acht|vier|fuenf|fünf|null|neun|eins|(ein(?!($|\\.|,|!|\\?)))|eine|einer|einen|zwei|zwo|sechs)";

    public static final String RoundNumberIntegerRegex = "(hundert|einhundert|tausend|(\\s*million\\s*)|(\\s*millionen\\s*)|(\\s*mio\\s*)|(\\s*milliarde\\s*)|(\\s*milliarden\\s*)|(\\s*mrd\\s*)|(\\s*billion\\s*)|(\\s*billionen\\s*))";

    public static final String AnIntRegex = "(eine|ein)(?=\\s)";

    public static final String TenToNineteenIntegerRegex = "(siebzehn|dreizehn|vierzehn|achtzehn|neunzehn|fuenfzehn|sechzehn|elf|zwoelf|zwölf|zehn)";

    public static final String TensNumberIntegerRegex = "(siebzig|zwanzig|dreißig|achtzig|neunzig|vierzig|fuenfzig|fünfzig|sechzig)";

    public static final String NegativeNumberTermsRegex = "^[.]";

    public static final String NegativeNumberSignRegex = "^({NegativeNumberTermsRegex}\\s+).*"
            .replace("{NegativeNumberTermsRegex}", NegativeNumberTermsRegex);

    public static final String SeparaIntRegex = "((({TenToNineteenIntegerRegex}|({ZeroToNineIntegerRegex}und{TensNumberIntegerRegex})|{TensNumberIntegerRegex}|{ZeroToNineIntegerRegex})(\\s*{RoundNumberIntegerRegex})*))|(({AnIntRegex}(\\s*{RoundNumberIntegerRegex})+))"
            .replace("{TenToNineteenIntegerRegex}", TenToNineteenIntegerRegex)
            .replace("{TensNumberIntegerRegex}", TensNumberIntegerRegex)
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex)
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex)
            .replace("{AnIntRegex}", AnIntRegex);

    public static final String AllIntRegex = "(((({TenToNineteenIntegerRegex}|({ZeroToNineIntegerRegex}und{TensNumberIntegerRegex})|{TensNumberIntegerRegex}|({ZeroToNineIntegerRegex}|{AnIntRegex}))?(\\s*{RoundNumberIntegerRegex})))*{SeparaIntRegex})"
            .replace("{TenToNineteenIntegerRegex}", TenToNineteenIntegerRegex)
            .replace("{TensNumberIntegerRegex}", TensNumberIntegerRegex)
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex)
            .replace("{AnIntRegex}", AnIntRegex)
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex)
            .replace("{SeparaIntRegex}", SeparaIntRegex);

    public static final String PlaceHolderPureNumber = "\\b";

    public static final String PlaceHolderDefault = "\\D|\\b";

    public static String NumbersWithPlaceHolder(String placeholder) {
        return "(((?<!\\d+\\s*)-\\s*)|(?<=\\b))\\d+(?!(\\,\\d+[a-zA-Z]))(?={placeholder})"
            .replace("{placeholder}", placeholder);
    }

    public static final String NumbersWithSuffix = "(((?<!\\d+\\s*)-\\s*)|(?<=\\b))\\d+\\s*{BaseNumbers.NumberMultiplierRegex}(?=\\b)"
            .replace("{BaseNumbers.NumberMultiplierRegex}", BaseNumbers.NumberMultiplierRegex);

    public static final String RoundNumberIntegerRegexWithLocks = "(?<=\\b)\\d+\\s*{RoundNumberIntegerRegex}(?=\\b)"
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex);

    public static final String NumbersWithDozenSuffix = "(((?<!\\d+\\s*)-\\s*)|(?<=\\b))\\d+\\s+dutzend(e)?(?=\\b)";

    public static final String AllIntRegexWithLocks = "((?<=\\b){AllIntRegex}(?=\\b))"
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String AllIntRegexWithDozenSuffixLocks = "(?<=\\b)(((ein\\s+)?halbes\\s+dutzend)|({AllIntRegex}\\s+dutzend(e)?))(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String RoundNumberOrdinalRegex = "(hundertst(er|es|en|el|e)?|tausendst(er|es|en|el|e)?|millionst(er|es|en|el|e)?|milliardst(er|es|en|el|e)?|billionst(er|es|en|el|e)?)";

    public static final String BasicOrdinalRegex = "(zuerst|erst(er|es|en|e)|zweit(er|es|en|e)?|dritt(er|es|en|el|e)?|viert(er|es|en|el|e)?|fünft(er|es|en|el|e)?|fuenft(er|es|en|el|e)?|sechst(er|es|en|el|e)?|siebt(er|es|en|el|e)?|acht(er|es|en|el|e)?|neunt(er|es|en|el|e)?|zehnt(er|es|en|el|e)?|elft(er|es|en|el|e)?|zwölft(er|es|en|el|e)?|zwoelft(er|es|en|el|e)?|dreizehnt(er|es|en|el|e)?|vierzehnt(er|es|en|el|e)?|fünfzehnt(er|es|en|el|e)?|fuenfzehnt(er|es|en|el|e)?|sechzehnt(er|es|en|el|e)?|siebzehnt(er|es|en|el|e)?|achtzehnt(er|es|en|el|e)?|neunzehnt(er|es|en|el|e)?|zwanzigst(er|es|en|el|e)?|dreißigst(er|es|en|el|e)?|vierziegt(er|es|en|el|e)?|fünfzigst(er|es|en|el|e)?|fuenfzigst(er|es|en|el|e)?|sechzigst(er|es|en|el|e)?|siebzigst(er|es|en|el|e)?|achtzigst(er|es|en|el|e)?|neunzigst(er|es|en|el|e)?)";

    public static final String SuffixBasicOrdinalRegex = "({BasicOrdinalRegex}|({ZeroToNineIntegerRegex}(und|\\s){BasicOrdinalRegex}))"
            .replace("{TensNumberIntegerRegex}", TensNumberIntegerRegex)
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex)
            .replace("{AnIntRegex}", AnIntRegex)
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex)
            .replace("{BasicOrdinalRegex}", BasicOrdinalRegex);

    public static final String SuffixRoundNumberOrdinalRegex = "(({AllIntRegex}\\s*){RoundNumberOrdinalRegex})"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{RoundNumberOrdinalRegex}", RoundNumberOrdinalRegex);

    public static final String AllOrdinalRegex = "(({AllIntRegex}\\s*)*{SuffixBasicOrdinalRegex}|{SuffixRoundNumberOrdinalRegex})"
            .replace("{SuffixBasicOrdinalRegex}", SuffixBasicOrdinalRegex)
            .replace("{SuffixRoundNumberOrdinalRegex}", SuffixRoundNumberOrdinalRegex)
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String OrdinalSuffixRegex = "^[\\.]";

    public static final String OrdinalNumericRegex = "(?<=\\b)(\\d{1,3}\\.)(?=(\\s+|^))";

    public static final String OrdinalRoundNumberRegex = "(?<!eine?\\s+){RoundNumberOrdinalRegex}"
            .replace("{RoundNumberOrdinalRegex}", RoundNumberOrdinalRegex);

    public static final String OrdinalGermanRegex = "(?<=\\b){AllOrdinalRegex}(?=\\b)"
            .replace("{AllOrdinalRegex}", AllOrdinalRegex);

    public static final String FractionNotationWithSpacesRegex = "(((?<=\\W|^)-\\s*)|(?<=\\b))\\d+\\s+\\d+[/]\\d+(?=(\\b[^/]|$))";

    public static final String FractionNotationRegex = "{BaseNumbers.FractionNotationRegex}"
            .replace("{BaseNumbers.FractionNotationRegex}", BaseNumbers.FractionNotationRegex);

    public static final String FractionUnitsRegex = "((?<onehalf>anderthalb|einundhalb)|(?<quarter>dreiviertel))";

    public static final String FractionHalfRegex = "(einhalb)$";

    public static final List<String> OneHalfTokens = Arrays.asList("ein", "halb");

    public static final String FractionNounRegex = "(?<=\\b)(({AllIntRegex})(\\s*|\\s*-\\s*)((({AllOrdinalRegex})|({RoundNumberOrdinalRegex}))|halb(er|e|es)?|hälfte)|{FractionUnitsRegex})(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{AllOrdinalRegex}", AllOrdinalRegex)
            .replace("{RoundNumberOrdinalRegex}", RoundNumberOrdinalRegex)
            .replace("{FractionUnitsRegex}", FractionUnitsRegex);

    public static final String FractionNounWithArticleRegex = "(?<=\\b)(({AllIntRegex}\\s+(und\\s+)?)?eine?(\\s+|\\s*-\\s*)({AllOrdinalRegex}|{RoundNumberOrdinalRegex}|{FractionUnitsRegex}|({AllIntRegex}ein)?(halb(er|e|es)?|hälfte))|{AllIntRegex}ein(halb))(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{AllOrdinalRegex}", AllOrdinalRegex)
            .replace("{RoundNumberOrdinalRegex}", RoundNumberOrdinalRegex)
            .replace("{FractionUnitsRegex}", FractionUnitsRegex);

    public static final String FractionPrepositionRegex = "(?<!{BaseNumbers.CommonCurrencySymbol}\\s*)(?<=\\b)(?<numerator>({AllIntRegex})|((?<!\\.)\\d+))\\s+over\\s+(?<denominator>({AllIntRegex})|(\\d+)(?!\\.))(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{BaseNumbers.CommonCurrencySymbol}", BaseNumbers.CommonCurrencySymbol);

    public static final String AllPointRegex = "((\\s*{ZeroToNineIntegerRegex})+|(\\s*{SeparaIntRegex}))"
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex)
            .replace("{SeparaIntRegex}", SeparaIntRegex);

    public static final String AllFloatRegex = "({AllIntRegex}(\\s*komma\\s*){AllPointRegex})"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{AllPointRegex}", AllPointRegex);

    public static final String DoubleWithMultiplierRegex = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+\\.)))\\d+\\.\\d+\\s*{BaseNumbers.NumberMultiplierRegex}(?=\\b)"
            .replace("{BaseNumbers.NumberMultiplierRegex}", BaseNumbers.NumberMultiplierRegex);

    public static final String DoubleExponentialNotationRegex = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+\\.)))(\\d+(\\.\\d+)?)e([+-]*[1-9]\\d*)(?=\\b)";

    public static final String DoubleCaretExponentialNotationRegex = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+\\.)))(\\d+(\\.\\d+)?)\\^([+-]*[1-9]\\d*)(?=\\b)";

    public static String DoubleDecimalPointRegex(String placeholder) {
        return "(?<=\\b)((\\d{1,3})(\\.\\d{3})*(\\,\\d+)?)(?={placeholder})"
            .replace("{placeholder}", placeholder);
    }

    public static String DoubleWithoutIntegralRegex(String placeholder) {
        return "(?<=\\s|^)(?<!(\\d+))\\.\\d+(?!(\\.\\d+))(?={placeholder})"
            .replace("{placeholder}", placeholder);
    }

    public static final String DoubleWithRoundNumber = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+\\,)))\\d+\\,\\d+\\s+{RoundNumberIntegerRegex}(?=\\b)"
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex);

    public static final String DoubleAllFloatRegex = "((?<=\\b){AllFloatRegex}(?=\\b))"
            .replace("{AllFloatRegex}", AllFloatRegex);

    public static final String NumberWithSuffixPercentage = "(?<!%)({BaseNumbers.NumberReplaceToken})(\\s*)(%(?!{BaseNumbers.NumberReplaceToken})|prozent(punkte)?\\b)"
            .replace("{BaseNumbers.NumberReplaceToken}", BaseNumbers.NumberReplaceToken);

    public static final String NumberWithPrefixPercentage = "(Prozent)(\\s*)({BaseNumbers.NumberReplaceToken})"
            .replace("{BaseNumbers.NumberReplaceToken}", BaseNumbers.NumberReplaceToken);

    public static final String AmbiguousFractionConnectorsRegex = "^[.]";

    public static final Character DecimalSeparatorChar = ',';

    public static final String FractionMarkerToken = "over";

    public static final Character NonDecimalSeparatorChar = '.';

    public static final String HalfADozenText = "sechs";

    public static final String WordSeparatorToken = "und";

    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("komma");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punkt");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("und");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("durch");

    public static final String HalfADozenRegex = "ein\\s+halbes\\s+dutzend";

    public static final String DigitalNumberRegex = "((?<=\\b)(hundert|tausend|million(en)?|mio|milliarde(n)?|mrd|billion(en)?|dutzend(e)?)(?=\\b))|((?<=(\\d|\\b)){BaseNumbers.MultiplierLookupRegex}(?=\\b))"
            .replace("{BaseNumbers.MultiplierLookupRegex}", BaseNumbers.MultiplierLookupRegex);

    public static final ImmutableMap<String, Long> CardinalNumberMap = ImmutableMap.<String, Long>builder()
        .put("ein", 1L)
        .put("null", 0L)
        .put("eine", 1L)
        .put("eins", 1L)
        .put("einer", 1L)
        .put("einen", 1L)
        .put("beiden", 2L)
        .put("zwei", 2L)
        .put("zwo", 2L)
        .put("drei", 3L)
        .put("vier", 4L)
        .put("fünf", 5L)
        .put("fuenf", 5L)
        .put("sechs", 6L)
        .put("sieben", 7L)
        .put("acht", 8L)
        .put("neun", 9L)
        .put("zehn", 10L)
        .put("elf", 11L)
        .put("zwölf", 12L)
        .put("zwoelf", 12L)
        .put("dutzend", 12L)
        .put("dreizehn", 13L)
        .put("vierzehn", 14L)
        .put("fünfzehn", 15L)
        .put("fuenfzehn", 15L)
        .put("sechzehn", 16L)
        .put("siebzehn", 17L)
        .put("achtzehn", 18L)
        .put("neunzehn", 19L)
        .put("zwanzig", 20L)
        .put("dreißig", 30L)
        .put("vierzig", 40L)
        .put("fünfzig", 50L)
        .put("fuenfzig", 50L)
        .put("sechzig", 60L)
        .put("siebzig", 70L)
        .put("achtzig", 80L)
        .put("neunzig", 90L)
        .put("hundert", 100L)
        .put("tausend", 1000L)
        .put("million", 1000000L)
        .put("mio", 1000000L)
        .put("millionen", 1000000L)
        .put("milliard", 100000000L)
        .put("milliarde", 1000000000L)
        .put("mrd", 1000000000L)
        .put("milliarden", 1000000000L)
        .put("billion", 1000000000000L)
        .put("billionen", 1000000000000L)
        .build();

    public static final ImmutableMap<String, Long> OrdinalNumberMap = ImmutableMap.<String, Long>builder()
        .put("zuerst", 1L)
        .put("erst", 1L)
        .put("erster", 1L)
        .put("erste", 1L)
        .put("erstes", 1L)
        .put("ersten", 1L)
        .put("zweit", 2L)
        .put("zweiter", 2L)
        .put("zweite", 2L)
        .put("zweites", 2L)
        .put("zweiten", 2L)
        .put("halb", 2L)
        .put("halbe", 2L)
        .put("halbes", 2L)
        .put("hälfte", 2L)
        .put("haelfte", 2L)
        .put("dritt", 3L)
        .put("dritter", 3L)
        .put("dritte", 3L)
        .put("drittes", 3L)
        .put("dritten", 3L)
        .put("drittel", 3L)
        .put("viert", 4L)
        .put("vierter", 4L)
        .put("vierte", 4L)
        .put("viertes", 4L)
        .put("vierten", 4L)
        .put("viertel", 4L)
        .put("fünft", 5L)
        .put("fünfter", 5L)
        .put("fünfte", 5L)
        .put("fünftes", 5L)
        .put("fünften", 5L)
        .put("fuenft", 5L)
        .put("fuenfter", 5L)
        .put("fuenfte", 5L)
        .put("fuenftes", 5L)
        .put("fuenften", 5L)
        .put("fünftel", 5L)
        .put("fuenftel", 5L)
        .put("sechst", 6L)
        .put("sechster", 6L)
        .put("sechste", 6L)
        .put("sechstes", 6L)
        .put("sechsten", 6L)
        .put("sechstel", 6L)
        .put("siebt", 7L)
        .put("siebter", 7L)
        .put("siebte", 7L)
        .put("siebtes", 7L)
        .put("siebten", 7L)
        .put("siebtel", 7L)
        .put("acht", 8L)
        .put("achter", 8L)
        .put("achte", 8L)
        .put("achtes", 8L)
        .put("achten", 8L)
        .put("achtel", 8L)
        .put("neunt", 9L)
        .put("neunter", 9L)
        .put("neunte", 9L)
        .put("neuntes", 9L)
        .put("neunten", 9L)
        .put("neuntel", 9L)
        .put("zehnt", 10L)
        .put("zehnter", 10L)
        .put("zehnte", 10L)
        .put("zehntes", 10L)
        .put("zehnten", 10L)
        .put("zehntel", 10L)
        .put("elft", 11L)
        .put("elfter", 11L)
        .put("elfte", 11L)
        .put("elftes", 11L)
        .put("elften", 11L)
        .put("elftel", 11L)
        .put("zwölft", 12L)
        .put("zwölfter", 12L)
        .put("zwölfte", 12L)
        .put("zwölftes", 12L)
        .put("zwölften", 12L)
        .put("zwoelft", 12L)
        .put("zwoelfter", 12L)
        .put("zwoelfte", 12L)
        .put("zwoelftes", 12L)
        .put("zwoelften", 12L)
        .put("zwölftel", 12L)
        .put("zwoelftel", 12L)
        .put("dreizehnt", 13L)
        .put("dreizehnter", 13L)
        .put("dreizehnte", 13L)
        .put("dreizehntes", 13L)
        .put("dreizehnten", 13L)
        .put("dreizehntel", 13L)
        .put("vierzehnt", 14L)
        .put("vierzehnter", 14L)
        .put("vierzehnte", 14L)
        .put("vierzehntes", 14L)
        .put("vierzehnten", 14L)
        .put("vierzehntel", 14L)
        .put("fünfzehnt", 15L)
        .put("fünfzehnter", 15L)
        .put("fünfzehnte", 15L)
        .put("fünfzehntes", 15L)
        .put("fünfzehnten", 15L)
        .put("fünfzehntel", 15L)
        .put("fuenfzehnt", 15L)
        .put("fuenfzehnter", 15L)
        .put("fuenfzehnte", 15L)
        .put("fuenfzehntes", 15L)
        .put("fuenfzehnten", 15L)
        .put("fuenfzehntel", 15L)
        .put("sechzehnt", 16L)
        .put("sechzehnter", 16L)
        .put("sechzehnte", 16L)
        .put("sechzehntes", 16L)
        .put("sechzehnten", 16L)
        .put("sechzehntel", 16L)
        .put("siebzehnt", 17L)
        .put("siebzehnter", 17L)
        .put("siebzehnte", 17L)
        .put("siebzehntes", 17L)
        .put("siebzehnten", 17L)
        .put("siebzehntel", 17L)
        .put("achtzehnt", 18L)
        .put("achtzehnter", 18L)
        .put("achtzehnte", 18L)
        .put("achtzehntes", 18L)
        .put("achtzehnten", 18L)
        .put("achtzehntel", 18L)
        .put("neunzehnt", 19L)
        .put("neunzehnter", 19L)
        .put("neunzehnte", 19L)
        .put("neunzehntes", 19L)
        .put("neunzehnten", 19L)
        .put("neunzehntel", 19L)
        .put("zwanzigst", 20L)
        .put("zwanzigster", 20L)
        .put("zwanzigste", 20L)
        .put("zwanzigstes", 20L)
        .put("zwanzigsten", 20L)
        .put("zwangtigstel", 20L)
        .put("dreißigst", 30L)
        .put("dreißigster", 30L)
        .put("dreißigste", 30L)
        .put("dreißigstes", 30L)
        .put("dreißigsten", 30L)
        .put("dreißigstel", 30L)
        .put("vierzigst", 40L)
        .put("vierzigster", 40L)
        .put("vierzigste", 40L)
        .put("vierzigstes", 40L)
        .put("vierzigsten", 40L)
        .put("vierzigstel", 40L)
        .put("fünfzigst", 50L)
        .put("fünfzigster", 50L)
        .put("fünfzigste", 50L)
        .put("fünfzigsten", 50L)
        .put("fünfzigstes", 50L)
        .put("fünfzigstel", 50L)
        .put("fuenfzigst", 50L)
        .put("fuenfzigster", 50L)
        .put("fuenfzigste", 50L)
        .put("fuenfzigstes", 50L)
        .put("fuenfzigsten", 50L)
        .put("fuenfzigstel", 50L)
        .put("sechzigst", 60L)
        .put("sechzigster", 60L)
        .put("sechzigste", 60L)
        .put("sechzigstes", 60L)
        .put("sechzigsten", 60L)
        .put("sechzigstel", 60L)
        .put("siebzigst", 70L)
        .put("siebzigster", 70L)
        .put("siebzigste", 70L)
        .put("siebzigstes", 70L)
        .put("siebzigsten", 70L)
        .put("siebzigstel", 70L)
        .put("achtzigst", 80L)
        .put("achtzigster", 80L)
        .put("achtzigste", 80L)
        .put("achtzigstes", 80L)
        .put("achtzigsten", 80L)
        .put("achtzigstel", 80L)
        .put("neunzigst", 90L)
        .put("neunzigster", 90L)
        .put("neunzigste", 90L)
        .put("neunzigstes", 90L)
        .put("neunzigsten", 90L)
        .put("neunzigstel", 90L)
        .put("hundertst", 100L)
        .put("hundertster", 100L)
        .put("hundertste", 100L)
        .put("hundertstes", 100L)
        .put("hundertsten", 100L)
        .put("hundertstel", 100L)
        .put("tausendst", 1000L)
        .put("tausendster", 1000L)
        .put("tausendste", 1000L)
        .put("tausendstes", 1000L)
        .put("tausendsten", 1000L)
        .put("tausendstel", 1000L)
        .put("millionst", 1000000L)
        .put("millionster", 1000000L)
        .put("millionste", 1000000L)
        .put("millionstes", 1000000L)
        .put("millionsten", 1000000L)
        .put("millionstel", 1000000L)
        .put("milliardster", 1000000000L)
        .put("milliardste", 1000000000L)
        .put("milliardstes", 1000000000L)
        .put("milliardsten", 1000000000L)
        .put("milliardstel", 1000000000L)
        .put("billionster", 1000000000000L)
        .put("billionste", 1000000000000L)
        .put("billionstes", 1000000000000L)
        .put("billionsten", 1000000000000L)
        .put("billionstel", 1000000000000L)
        .build();

    public static final ImmutableMap<String, Long> RoundNumberMap = ImmutableMap.<String, Long>builder()
        .put("hundert", 100L)
        .put("tausend", 1000L)
        .put("million", 1000000L)
        .put("millionen", 1000000L)
        .put("mio", 1000000L)
        .put("milliard", 1000000000L)
        .put("milliarde", 1000000000L)
        .put("milliarden", 1000000000L)
        .put("mrd", 1000000000L)
        .put("billion", 1000000000000L)
        .put("billionen", 1000000000000L)
        .put("hundertstel", 100L)
        .put("tausendstel", 1000L)
        .put("millionstel", 1000000L)
        .put("milliardstel", 1000000000L)
        .put("billionstel", 1000000000000L)
        .put("hundredths", 100L)
        .put("dutzend", 12L)
        .put("dutzende", 12L)
        .put("k", 1000L)
        .put("m", 1000000L)
        .put("g", 1000000000L)
        .put("b", 1000000000L)
        .put("t", 1000000000000L)
        .build();

    public static final ImmutableMap<String, String> AmbiguityFiltersDict = ImmutableMap.<String, String>builder()
        .put("^[.]", "")
        .build();

    public static final ImmutableMap<String, String> RelativeReferenceOffsetMap = ImmutableMap.<String, String>builder()
        .put("", "")
        .build();

    public static final ImmutableMap<String, String> RelativeReferenceRelativeToMap = ImmutableMap.<String, String>builder()
        .put("", "")
        .build();
}