package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

@Generated
public
    fun sentimentAnalysisSettingsProperty(initializer: CfnBotAlias.SentimentAnalysisSettingsProperty.Builder.() -> Unit
    = {}): CfnBotAlias.SentimentAnalysisSettingsProperty =
    CfnBotAlias.SentimentAnalysisSettingsProperty.builder().apply(initializer).build()
