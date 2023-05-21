package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun iPSetReferenceProperty(initializer: CfnRuleGroup.IPSetReferenceProperty.Builder.() -> Unit =
    {}): CfnRuleGroup.IPSetReferenceProperty =
    CfnRuleGroup.IPSetReferenceProperty.builder().apply(initializer).build()
