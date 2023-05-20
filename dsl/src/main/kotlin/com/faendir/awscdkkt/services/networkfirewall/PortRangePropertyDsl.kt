@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public fun portRangeProperty(initializer: CfnRuleGroup.PortRangeProperty.Builder.() -> Unit):
    CfnRuleGroup.PortRangeProperty =
    CfnRuleGroup.PortRangeProperty.builder().apply(initializer).build()
