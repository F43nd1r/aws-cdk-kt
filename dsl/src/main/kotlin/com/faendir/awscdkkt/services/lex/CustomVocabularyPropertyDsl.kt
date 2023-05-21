package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public fun customVocabularyProperty(initializer: CfnBot.CustomVocabularyProperty.Builder.() -> Unit
    = {}): CfnBot.CustomVocabularyProperty =
    CfnBot.CustomVocabularyProperty.builder().apply(initializer).build()
