package com.faendir.awscdkkt.services.neptune

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBCluster

@Generated
public fun dBClusterRoleProperty(initializer: CfnDBCluster.DBClusterRoleProperty.Builder.() -> Unit
    = {}): CfnDBCluster.DBClusterRoleProperty =
    CfnDBCluster.DBClusterRoleProperty.builder().apply(initializer).build()
