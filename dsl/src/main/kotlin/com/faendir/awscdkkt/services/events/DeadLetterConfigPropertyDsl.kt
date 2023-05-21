package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun deadLetterConfigProperty(initializer: CfnRule.DeadLetterConfigProperty.Builder.() -> Unit
    = {}): CfnRule.DeadLetterConfigProperty =
    CfnRule.DeadLetterConfigProperty.builder().apply(initializer).build()
