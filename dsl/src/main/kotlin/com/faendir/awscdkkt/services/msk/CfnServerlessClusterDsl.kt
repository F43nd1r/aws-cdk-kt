package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.amazon.awscdk.services.msk.CfnServerlessClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServerlessCluster(
  id: String,
  props: CfnServerlessClusterProps,
  initializer: CfnServerlessCluster.() -> Unit = {},
): CfnServerlessCluster = CfnServerlessCluster(this, id, props).apply(initializer)
