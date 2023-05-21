package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun initialResponseSettingProperty(initializer: CfnBot.InitialResponseSettingProperty.Builder.() -> Unit
    = {}): CfnBot.InitialResponseSettingProperty =
    CfnBot.InitialResponseSettingProperty.builder().apply(initializer).build()
