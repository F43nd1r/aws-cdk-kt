package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public fun buildIPSetProperty(initializer: @AwsCdkDsl
    CfnRuleGroup.IPSetProperty.Builder.() -> Unit): CfnRuleGroup.IPSetProperty =
    CfnRuleGroup.IPSetProperty.Builder().apply(initializer).build()
