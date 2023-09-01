package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster

@Generated
public fun buildDBClusterRoleProperty(initializer: @AwsCdkDsl
    CfnDBCluster.DBClusterRoleProperty.Builder.() -> Unit = {}): CfnDBCluster.DBClusterRoleProperty
    = CfnDBCluster.DBClusterRoleProperty.Builder().apply(initializer).build()
