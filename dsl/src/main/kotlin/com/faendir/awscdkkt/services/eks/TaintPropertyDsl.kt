package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

@Generated
public fun taintProperty(initializer: CfnNodegroup.TaintProperty.Builder.() -> Unit = {}):
    CfnNodegroup.TaintProperty = CfnNodegroup.TaintProperty.builder().apply(initializer).build()
