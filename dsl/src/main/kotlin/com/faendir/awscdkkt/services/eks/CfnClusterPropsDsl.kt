package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnClusterProps

@Generated
public fun cfnClusterProps(initializer: CfnClusterProps.Builder.() -> Unit = {}): CfnClusterProps =
    CfnClusterProps.builder().apply(initializer).build()
