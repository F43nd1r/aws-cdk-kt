@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public
    fun statefulRuleOptionsProperty(initializer: CfnRuleGroup.StatefulRuleOptionsProperty.Builder.() -> Unit):
    CfnRuleGroup.StatefulRuleOptionsProperty =
    CfnRuleGroup.StatefulRuleOptionsProperty.builder().apply(initializer).build()
