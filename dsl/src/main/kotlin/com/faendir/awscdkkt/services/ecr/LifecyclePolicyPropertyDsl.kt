@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository

public
    fun lifecyclePolicyProperty(initializer: CfnRepository.LifecyclePolicyProperty.Builder.() -> Unit):
    CfnRepository.LifecyclePolicyProperty =
    CfnRepository.LifecyclePolicyProperty.builder().apply(initializer).build()
