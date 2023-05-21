package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun textInputSpecificationProperty(initializer: CfnBot.TextInputSpecificationProperty.Builder.() -> Unit
    = {}): CfnBot.TextInputSpecificationProperty =
    CfnBot.TextInputSpecificationProperty.builder().apply(initializer).build()
