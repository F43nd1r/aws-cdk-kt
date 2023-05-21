package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster

@Generated
public fun readEndpointProperty(initializer: CfnDBCluster.ReadEndpointProperty.Builder.() -> Unit =
    {}): CfnDBCluster.ReadEndpointProperty =
    CfnDBCluster.ReadEndpointProperty.builder().apply(initializer).build()
