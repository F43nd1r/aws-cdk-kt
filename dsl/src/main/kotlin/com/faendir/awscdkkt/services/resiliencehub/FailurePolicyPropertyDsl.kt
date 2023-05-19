@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.resiliencehub

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy

public
    fun failurePolicyProperty(initializer: CfnResiliencyPolicy.FailurePolicyProperty.Builder.() -> Unit):
    CfnResiliencyPolicy.FailurePolicyProperty =
    CfnResiliencyPolicy.FailurePolicyProperty.builder().apply(initializer).build()
