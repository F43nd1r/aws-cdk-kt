package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnFargateProfile

@Generated
public fun labelProperty(initializer: CfnFargateProfile.LabelProperty.Builder.() -> Unit = {}):
    CfnFargateProfile.LabelProperty =
    CfnFargateProfile.LabelProperty.builder().apply(initializer).build()
