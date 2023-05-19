@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.neptune

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBCluster

public
    fun dBClusterRoleProperty(initializer: CfnDBCluster.DBClusterRoleProperty.Builder.() -> Unit):
    CfnDBCluster.DBClusterRoleProperty =
    CfnDBCluster.DBClusterRoleProperty.builder().apply(initializer).build()
