package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnFargateProfile

@Generated
public fun selectorProperty(initializer: CfnFargateProfile.SelectorProperty.Builder.() -> Unit =
    {}): CfnFargateProfile.SelectorProperty =
    CfnFargateProfile.SelectorProperty.builder().apply(initializer).build()
