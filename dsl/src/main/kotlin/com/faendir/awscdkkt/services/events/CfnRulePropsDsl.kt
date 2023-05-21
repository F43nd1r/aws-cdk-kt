package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRuleProps

@Generated
public fun cfnRuleProps(initializer: CfnRuleProps.Builder.() -> Unit = {}): CfnRuleProps =
    CfnRuleProps.builder().apply(initializer).build()
