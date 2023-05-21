package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public fun sessionAttributeProperty(initializer: CfnBot.SessionAttributeProperty.Builder.() -> Unit
    = {}): CfnBot.SessionAttributeProperty =
    CfnBot.SessionAttributeProperty.builder().apply(initializer).build()
