package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBCluster(id: String, initializer: @AwsCdkDsl CfnDBCluster.() -> Unit = {}): CfnDBCluster = CfnDBCluster(this, id).apply(initializer)

@Generated
public fun Construct.cfnDBCluster(
  id: String,
  props: CfnDBClusterProps,
  initializer: @AwsCdkDsl CfnDBCluster.() -> Unit = {},
): CfnDBCluster = CfnDBCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBCluster(id: String, initializer: @AwsCdkDsl CfnDBCluster.Builder.() -> Unit = {}): CfnDBCluster = CfnDBCluster.Builder.create(this, id).apply(initializer).build()
