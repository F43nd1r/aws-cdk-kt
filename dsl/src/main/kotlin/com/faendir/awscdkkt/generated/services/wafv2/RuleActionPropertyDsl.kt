package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun buildRuleActionProperty(initializer: @AwsCdkDsl
    CfnWebACL.RuleActionProperty.Builder.() -> Unit = {}): CfnWebACL.RuleActionProperty =
    CfnWebACL.RuleActionProperty.Builder().apply(initializer).build()
