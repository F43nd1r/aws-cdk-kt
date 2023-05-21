package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnClusterProps

@Generated
public fun cfnClusterProps(initializer: CfnClusterProps.Builder.() -> Unit = {}): CfnClusterProps =
    CfnClusterProps.builder().apply(initializer).build()
