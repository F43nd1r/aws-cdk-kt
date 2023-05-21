package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun waitAndContinueSpecificationProperty(initializer: CfnBot.WaitAndContinueSpecificationProperty.Builder.() -> Unit
    = {}): CfnBot.WaitAndContinueSpecificationProperty =
    CfnBot.WaitAndContinueSpecificationProperty.builder().apply(initializer).build()
