package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

@Generated
public
    fun launchTemplateSpecificationProperty(initializer: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit
    = {}): CfnNodegroup.LaunchTemplateSpecificationProperty =
    CfnNodegroup.LaunchTemplateSpecificationProperty.builder().apply(initializer).build()
