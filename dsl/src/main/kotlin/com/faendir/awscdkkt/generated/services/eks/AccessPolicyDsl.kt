package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AccessPolicy

@Generated
public fun buildAccessPolicy(initializer: @AwsCdkDsl AccessPolicy.Builder.() -> Unit = {}):
    AccessPolicy = AccessPolicy.Builder.create().apply(initializer).build()
