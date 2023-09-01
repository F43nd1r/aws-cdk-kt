package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository

@Generated
public fun buildLifecyclePolicyProperty(initializer: @AwsCdkDsl
    CfnRepository.LifecyclePolicyProperty.Builder.() -> Unit = {}):
    CfnRepository.LifecyclePolicyProperty =
    CfnRepository.LifecyclePolicyProperty.Builder().apply(initializer).build()
