package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

@Generated
public fun gatingRuleProperty(initializer: CfnSafetyRule.GatingRuleProperty.Builder.() -> Unit =
    {}): CfnSafetyRule.GatingRuleProperty =
    CfnSafetyRule.GatingRuleProperty.builder().apply(initializer).build()
