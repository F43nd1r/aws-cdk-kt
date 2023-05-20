@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public fun statefulRuleProperty(initializer: CfnRuleGroup.StatefulRuleProperty.Builder.() -> Unit):
    CfnRuleGroup.StatefulRuleProperty =
    CfnRuleGroup.StatefulRuleProperty.builder().apply(initializer).build()
