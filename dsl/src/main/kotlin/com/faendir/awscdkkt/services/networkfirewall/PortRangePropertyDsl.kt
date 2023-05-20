@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public fun portRangeProperty(initializer: CfnRuleGroup.PortRangeProperty.Builder.() -> Unit):
    CfnRuleGroup.PortRangeProperty =
    CfnRuleGroup.PortRangeProperty.builder().apply(initializer).build()
