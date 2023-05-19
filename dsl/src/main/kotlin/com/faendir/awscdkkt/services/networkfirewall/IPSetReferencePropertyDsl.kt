@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public
    fun iPSetReferenceProperty(initializer: CfnRuleGroup.IPSetReferenceProperty.Builder.() -> Unit):
    CfnRuleGroup.IPSetReferenceProperty =
    CfnRuleGroup.IPSetReferenceProperty.builder().apply(initializer).build()
