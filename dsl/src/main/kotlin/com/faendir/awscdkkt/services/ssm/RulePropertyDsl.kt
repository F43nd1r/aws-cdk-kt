package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@Generated
public fun ruleProperty(initializer: CfnPatchBaseline.RuleProperty.Builder.() -> Unit = {}):
    CfnPatchBaseline.RuleProperty =
    CfnPatchBaseline.RuleProperty.builder().apply(initializer).build()
