package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun conditionalSpecificationProperty(initializer: CfnBot.ConditionalSpecificationProperty.Builder.() -> Unit
    = {}): CfnBot.ConditionalSpecificationProperty =
    CfnBot.ConditionalSpecificationProperty.builder().apply(initializer).build()
