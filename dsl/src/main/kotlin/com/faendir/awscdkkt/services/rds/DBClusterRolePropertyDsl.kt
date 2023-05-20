@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster

public
    fun dBClusterRoleProperty(initializer: CfnDBCluster.DBClusterRoleProperty.Builder.() -> Unit):
    CfnDBCluster.DBClusterRoleProperty =
    CfnDBCluster.DBClusterRoleProperty.builder().apply(initializer).build()
