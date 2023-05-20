@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessCluster
import software.amazon.awscdk.services.rds.ServerlessClusterProps
import software.constructs.Construct

public fun Construct.serverlessCluster(
  id: String,
  props: ServerlessClusterProps,
  initializer: ServerlessCluster.() -> Unit = {},
): ServerlessCluster = ServerlessCluster(this, id, props).apply(initializer)
