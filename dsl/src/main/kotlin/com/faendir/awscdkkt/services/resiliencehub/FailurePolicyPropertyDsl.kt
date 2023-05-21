package com.faendir.awscdkkt.services.resiliencehub

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy

@Generated
public
    fun failurePolicyProperty(initializer: CfnResiliencyPolicy.FailurePolicyProperty.Builder.() -> Unit
    = {}): CfnResiliencyPolicy.FailurePolicyProperty =
    CfnResiliencyPolicy.FailurePolicyProperty.builder().apply(initializer).build()
