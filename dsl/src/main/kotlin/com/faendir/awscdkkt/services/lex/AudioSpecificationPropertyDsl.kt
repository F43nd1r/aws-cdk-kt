package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun audioSpecificationProperty(initializer: CfnBot.AudioSpecificationProperty.Builder.() -> Unit
    = {}): CfnBot.AudioSpecificationProperty =
    CfnBot.AudioSpecificationProperty.builder().apply(initializer).build()
