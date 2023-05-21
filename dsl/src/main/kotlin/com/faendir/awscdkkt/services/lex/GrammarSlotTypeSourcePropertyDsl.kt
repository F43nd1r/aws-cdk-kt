package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun grammarSlotTypeSourceProperty(initializer: CfnBot.GrammarSlotTypeSourceProperty.Builder.() -> Unit
    = {}): CfnBot.GrammarSlotTypeSourceProperty =
    CfnBot.GrammarSlotTypeSourceProperty.builder().apply(initializer).build()
