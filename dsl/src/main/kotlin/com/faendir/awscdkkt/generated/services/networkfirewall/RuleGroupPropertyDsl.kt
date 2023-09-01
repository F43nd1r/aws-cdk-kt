package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public fun buildRuleGroupProperty(initializer: @AwsCdkDsl
    CfnRuleGroup.RuleGroupProperty.Builder.() -> Unit = {}): CfnRuleGroup.RuleGroupProperty =
    CfnRuleGroup.RuleGroupProperty.Builder().apply(initializer).build()
