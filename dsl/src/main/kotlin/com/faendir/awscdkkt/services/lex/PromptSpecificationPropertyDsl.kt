package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun promptSpecificationProperty(initializer: CfnBot.PromptSpecificationProperty.Builder.() -> Unit
    = {}): CfnBot.PromptSpecificationProperty =
    CfnBot.PromptSpecificationProperty.builder().apply(initializer).build()
