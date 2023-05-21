package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnRule

@Generated
public
    fun ruleTriggerEventSourceProperty(initializer: CfnRule.RuleTriggerEventSourceProperty.Builder.() -> Unit
    = {}): CfnRule.RuleTriggerEventSourceProperty =
    CfnRule.RuleTriggerEventSourceProperty.builder().apply(initializer).build()
