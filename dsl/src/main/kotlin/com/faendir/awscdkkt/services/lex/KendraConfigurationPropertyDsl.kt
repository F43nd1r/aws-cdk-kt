package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun kendraConfigurationProperty(initializer: CfnBot.KendraConfigurationProperty.Builder.() -> Unit
    = {}): CfnBot.KendraConfigurationProperty =
    CfnBot.KendraConfigurationProperty.builder().apply(initializer).build()
