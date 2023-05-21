package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

@Generated
public
    fun audioLogDestinationProperty(initializer: CfnBotAlias.AudioLogDestinationProperty.Builder.() -> Unit
    = {}): CfnBotAlias.AudioLogDestinationProperty =
    CfnBotAlias.AudioLogDestinationProperty.builder().apply(initializer).build()
