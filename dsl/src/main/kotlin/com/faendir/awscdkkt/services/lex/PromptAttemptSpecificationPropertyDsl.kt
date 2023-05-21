package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun promptAttemptSpecificationProperty(initializer: CfnBot.PromptAttemptSpecificationProperty.Builder.() -> Unit
    = {}): CfnBot.PromptAttemptSpecificationProperty =
    CfnBot.PromptAttemptSpecificationProperty.builder().apply(initializer).build()
