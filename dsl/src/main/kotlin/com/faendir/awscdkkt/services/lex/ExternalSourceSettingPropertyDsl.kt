package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun externalSourceSettingProperty(initializer: CfnBot.ExternalSourceSettingProperty.Builder.() -> Unit
    = {}): CfnBot.ExternalSourceSettingProperty =
    CfnBot.ExternalSourceSettingProperty.builder().apply(initializer).build()
