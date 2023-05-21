package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

@Generated
public
    fun cloudWatchLogGroupLogDestinationProperty(initializer: CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.Builder.() -> Unit
    = {}): CfnBotAlias.CloudWatchLogGroupLogDestinationProperty =
    CfnBotAlias.CloudWatchLogGroupLogDestinationProperty.builder().apply(initializer).build()
