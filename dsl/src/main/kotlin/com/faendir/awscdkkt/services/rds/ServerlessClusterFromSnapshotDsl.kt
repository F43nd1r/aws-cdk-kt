@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps
import software.constructs.Construct

public fun Construct.serverlessClusterFromSnapshot(
  id: String,
  props: ServerlessClusterFromSnapshotProps,
  initializer: ServerlessClusterFromSnapshot.() -> Unit = {},
): ServerlessClusterFromSnapshot = ServerlessClusterFromSnapshot(this, id, props).apply(initializer)
