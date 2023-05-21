package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public fun plainTextMessageProperty(initializer: CfnBot.PlainTextMessageProperty.Builder.() -> Unit
    = {}): CfnBot.PlainTextMessageProperty =
    CfnBot.PlainTextMessageProperty.builder().apply(initializer).build()
