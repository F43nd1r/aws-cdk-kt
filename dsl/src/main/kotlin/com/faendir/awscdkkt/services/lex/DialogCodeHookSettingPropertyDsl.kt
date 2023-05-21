package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun dialogCodeHookSettingProperty(initializer: CfnBot.DialogCodeHookSettingProperty.Builder.() -> Unit
    = {}): CfnBot.DialogCodeHookSettingProperty =
    CfnBot.DialogCodeHookSettingProperty.builder().apply(initializer).build()
