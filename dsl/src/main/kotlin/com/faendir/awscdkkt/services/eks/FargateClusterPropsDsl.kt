package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateClusterProps

@Generated
public fun fargateClusterProps(initializer: FargateClusterProps.Builder.() -> Unit = {}):
    FargateClusterProps = FargateClusterProps.builder().apply(initializer).build()
