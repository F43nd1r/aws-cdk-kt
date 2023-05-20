@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

public fun ruleConfigProperty(initializer: CfnSafetyRule.RuleConfigProperty.Builder.() -> Unit):
    CfnSafetyRule.RuleConfigProperty =
    CfnSafetyRule.RuleConfigProperty.builder().apply(initializer).build()
