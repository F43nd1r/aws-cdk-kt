package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ClusterAttributes

@Generated
public fun buildClusterAttributes(initializer: @AwsCdkDsl ClusterAttributes.Builder.() -> Unit =
    {}): ClusterAttributes = ClusterAttributes.Builder().apply(initializer).build()
