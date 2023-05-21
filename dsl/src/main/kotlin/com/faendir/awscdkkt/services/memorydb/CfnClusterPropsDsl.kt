package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnClusterProps

@Generated
public fun cfnClusterProps(initializer: CfnClusterProps.Builder.() -> Unit = {}): CfnClusterProps =
    CfnClusterProps.builder().apply(initializer).build()
