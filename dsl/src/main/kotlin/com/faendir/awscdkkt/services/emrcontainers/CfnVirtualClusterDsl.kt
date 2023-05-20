@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.emrcontainers

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps
import software.constructs.Construct

public fun Construct.cfnVirtualCluster(
  id: String,
  props: CfnVirtualClusterProps,
  initializer: CfnVirtualCluster.() -> Unit = {},
): CfnVirtualCluster = CfnVirtualCluster(this, id, props).apply(initializer)
