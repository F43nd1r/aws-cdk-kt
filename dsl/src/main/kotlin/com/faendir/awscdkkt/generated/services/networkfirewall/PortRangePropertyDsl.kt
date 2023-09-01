package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public fun buildPortRangeProperty(initializer: @AwsCdkDsl
    CfnRuleGroup.PortRangeProperty.Builder.() -> Unit = {}): CfnRuleGroup.PortRangeProperty =
    CfnRuleGroup.PortRangeProperty.Builder().apply(initializer).build()
