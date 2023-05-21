package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public fun portSetProperty(initializer: CfnRuleGroup.PortSetProperty.Builder.() -> Unit = {}):
    CfnRuleGroup.PortSetProperty = CfnRuleGroup.PortSetProperty.builder().apply(initializer).build()
