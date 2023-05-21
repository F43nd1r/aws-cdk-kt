package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun inputTransformerProperty(initializer: CfnRule.InputTransformerProperty.Builder.() -> Unit
    = {}): CfnRule.InputTransformerProperty =
    CfnRule.InputTransformerProperty.builder().apply(initializer).build()
