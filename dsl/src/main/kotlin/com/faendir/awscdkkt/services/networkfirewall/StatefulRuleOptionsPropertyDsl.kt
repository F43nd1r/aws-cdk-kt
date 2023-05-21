package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun statefulRuleOptionsProperty(initializer: CfnRuleGroup.StatefulRuleOptionsProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.StatefulRuleOptionsProperty =
    CfnRuleGroup.StatefulRuleOptionsProperty.builder().apply(initializer).build()
