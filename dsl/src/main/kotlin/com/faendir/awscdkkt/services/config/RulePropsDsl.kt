package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.RuleProps

@Generated
public fun ruleProps(initializer: RuleProps.Builder.() -> Unit = {}): RuleProps =
    RuleProps.builder().apply(initializer).build()
