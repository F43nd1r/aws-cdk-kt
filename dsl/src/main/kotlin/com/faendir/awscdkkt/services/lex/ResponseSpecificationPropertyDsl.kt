package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun responseSpecificationProperty(initializer: CfnBot.ResponseSpecificationProperty.Builder.() -> Unit
    = {}): CfnBot.ResponseSpecificationProperty =
    CfnBot.ResponseSpecificationProperty.builder().apply(initializer).build()
