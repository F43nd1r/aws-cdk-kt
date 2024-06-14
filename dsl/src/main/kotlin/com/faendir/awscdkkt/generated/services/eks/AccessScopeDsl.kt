package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AccessScope

@Generated
public fun buildAccessScope(initializer: @AwsCdkDsl AccessScope.Builder.() -> Unit = {}):
    AccessScope = AccessScope.Builder().apply(initializer).build()
