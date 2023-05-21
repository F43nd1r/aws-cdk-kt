package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun customVocabularyItemProperty(initializer: CfnBot.CustomVocabularyItemProperty.Builder.() -> Unit
    = {}): CfnBot.CustomVocabularyItemProperty =
    CfnBot.CustomVocabularyItemProperty.builder().apply(initializer).build()
