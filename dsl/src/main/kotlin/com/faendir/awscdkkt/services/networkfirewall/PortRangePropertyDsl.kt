package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public fun portRangeProperty(initializer: CfnRuleGroup.PortRangeProperty.Builder.() -> Unit = {}):
    CfnRuleGroup.PortRangeProperty =
    CfnRuleGroup.PortRangeProperty.builder().apply(initializer).build()
