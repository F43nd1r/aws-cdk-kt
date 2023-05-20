@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.resiliencehub

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy

public
    fun failurePolicyProperty(initializer: CfnResiliencyPolicy.FailurePolicyProperty.Builder.() -> Unit):
    CfnResiliencyPolicy.FailurePolicyProperty =
    CfnResiliencyPolicy.FailurePolicyProperty.builder().apply(initializer).build()
