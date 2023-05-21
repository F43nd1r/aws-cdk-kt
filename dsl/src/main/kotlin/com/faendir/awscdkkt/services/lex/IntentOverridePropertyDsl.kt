package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public fun intentOverrideProperty(initializer: CfnBot.IntentOverrideProperty.Builder.() -> Unit =
    {}): CfnBot.IntentOverrideProperty =
    CfnBot.IntentOverrideProperty.builder().apply(initializer).build()
