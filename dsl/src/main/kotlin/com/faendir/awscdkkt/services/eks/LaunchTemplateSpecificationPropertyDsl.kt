@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

public
    fun launchTemplateSpecificationProperty(initializer: CfnNodegroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
    CfnNodegroup.LaunchTemplateSpecificationProperty =
    CfnNodegroup.LaunchTemplateSpecificationProperty.builder().apply(initializer).build()
