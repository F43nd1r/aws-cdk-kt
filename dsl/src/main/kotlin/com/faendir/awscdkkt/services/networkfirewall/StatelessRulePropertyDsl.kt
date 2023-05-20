@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public
    fun statelessRuleProperty(initializer: CfnRuleGroup.StatelessRuleProperty.Builder.() -> Unit):
    CfnRuleGroup.StatelessRuleProperty =
    CfnRuleGroup.StatelessRuleProperty.builder().apply(initializer).build()
