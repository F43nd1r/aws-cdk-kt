package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@Generated
public fun ruleGroupProperty(initializer: CfnPatchBaseline.RuleGroupProperty.Builder.() -> Unit =
    {}): CfnPatchBaseline.RuleGroupProperty =
    CfnPatchBaseline.RuleGroupProperty.builder().apply(initializer).build()
