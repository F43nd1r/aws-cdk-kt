package com.faendir.awscdkkt.generated.services.efs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem

@Generated
public fun buildLifecyclePolicyProperty(initializer: @AwsCdkDsl
    CfnFileSystem.LifecyclePolicyProperty.Builder.() -> Unit = {}):
    CfnFileSystem.LifecyclePolicyProperty =
    CfnFileSystem.LifecyclePolicyProperty.Builder().apply(initializer).build()
