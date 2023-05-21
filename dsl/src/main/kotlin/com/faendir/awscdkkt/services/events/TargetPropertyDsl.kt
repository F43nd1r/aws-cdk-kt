package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun targetProperty(initializer: CfnRule.TargetProperty.Builder.() -> Unit = {}):
    CfnRule.TargetProperty = CfnRule.TargetProperty.builder().apply(initializer).build()
