package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

@Generated
public fun updateConfigProperty(initializer: CfnNodegroup.UpdateConfigProperty.Builder.() -> Unit =
    {}): CfnNodegroup.UpdateConfigProperty =
    CfnNodegroup.UpdateConfigProperty.builder().apply(initializer).build()
