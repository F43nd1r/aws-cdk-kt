package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnIPSet

@Generated
public fun iPSetDescriptorProperty(initializer: CfnIPSet.IPSetDescriptorProperty.Builder.() -> Unit
    = {}): CfnIPSet.IPSetDescriptorProperty =
    CfnIPSet.IPSetDescriptorProperty.builder().apply(initializer).build()
