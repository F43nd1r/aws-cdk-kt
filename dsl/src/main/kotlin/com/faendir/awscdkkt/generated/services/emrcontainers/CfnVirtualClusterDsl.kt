package com.faendir.awscdkkt.generated.services.emrcontainers

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVirtualCluster(
  id: String,
  props: CfnVirtualClusterProps,
  initializer: @AwsCdkDsl CfnVirtualCluster.() -> Unit = {},
): CfnVirtualCluster = CfnVirtualCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVirtualCluster(id: String, initializer: @AwsCdkDsl
    CfnVirtualCluster.Builder.() -> Unit = {}): CfnVirtualCluster =
    CfnVirtualCluster.Builder.create(this, id).apply(initializer).build()
