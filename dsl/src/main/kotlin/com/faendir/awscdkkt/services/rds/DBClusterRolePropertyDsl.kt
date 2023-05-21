package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster

@Generated
public fun dBClusterRoleProperty(initializer: CfnDBCluster.DBClusterRoleProperty.Builder.() -> Unit
    = {}): CfnDBCluster.DBClusterRoleProperty =
    CfnDBCluster.DBClusterRoleProperty.builder().apply(initializer).build()
