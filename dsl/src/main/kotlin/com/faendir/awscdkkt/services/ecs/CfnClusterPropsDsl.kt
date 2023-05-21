package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnClusterProps

@Generated
public fun cfnClusterProps(initializer: CfnClusterProps.Builder.() -> Unit = {}): CfnClusterProps =
    CfnClusterProps.builder().apply(initializer).build()
