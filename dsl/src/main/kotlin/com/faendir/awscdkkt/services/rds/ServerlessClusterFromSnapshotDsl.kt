package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.serverlessClusterFromSnapshot(
  id: String,
  props: ServerlessClusterFromSnapshotProps,
  initializer: ServerlessClusterFromSnapshot.() -> Unit = {},
): ServerlessClusterFromSnapshot = ServerlessClusterFromSnapshot(this, id, props).apply(initializer)
