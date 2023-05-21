package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.ManagedRuleProps

@Generated
public fun managedRuleProps(initializer: ManagedRuleProps.Builder.() -> Unit = {}): ManagedRuleProps
    = ManagedRuleProps.builder().apply(initializer).build()
