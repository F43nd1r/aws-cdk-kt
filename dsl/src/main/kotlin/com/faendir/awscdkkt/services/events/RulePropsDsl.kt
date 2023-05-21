package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.RuleProps

@Generated
public fun ruleProps(initializer: RuleProps.Builder.() -> Unit = {}): RuleProps =
    RuleProps.builder().apply(initializer).build()
