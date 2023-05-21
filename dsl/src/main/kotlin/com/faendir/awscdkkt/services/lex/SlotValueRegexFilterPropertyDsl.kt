package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun slotValueRegexFilterProperty(initializer: CfnBot.SlotValueRegexFilterProperty.Builder.() -> Unit
    = {}): CfnBot.SlotValueRegexFilterProperty =
    CfnBot.SlotValueRegexFilterProperty.builder().apply(initializer).build()
