package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun intentConfirmationSettingProperty(initializer: CfnBot.IntentConfirmationSettingProperty.Builder.() -> Unit
    = {}): CfnBot.IntentConfirmationSettingProperty =
    CfnBot.IntentConfirmationSettingProperty.builder().apply(initializer).build()
