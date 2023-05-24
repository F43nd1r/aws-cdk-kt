package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ClusterProps

@Generated
public fun buildClusterProps(initializer: @AwsCdkDsl ClusterProps.Builder.() -> Unit): ClusterProps
    = ClusterProps.Builder().apply(initializer).build()
