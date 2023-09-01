package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@Generated
public fun buildBlockProperty(initializer: @AwsCdkDsl CfnRuleGroup.BlockProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.BlockProperty =
    CfnRuleGroup.BlockProperty.Builder().apply(initializer).build()
