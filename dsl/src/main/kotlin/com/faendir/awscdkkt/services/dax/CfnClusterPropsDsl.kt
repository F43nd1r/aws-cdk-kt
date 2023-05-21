package com.faendir.awscdkkt.services.dax

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnClusterProps

@Generated
public fun cfnClusterProps(initializer: CfnClusterProps.Builder.() -> Unit = {}): CfnClusterProps =
    CfnClusterProps.builder().apply(initializer).build()
