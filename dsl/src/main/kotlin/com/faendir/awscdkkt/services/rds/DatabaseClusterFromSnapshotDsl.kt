@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps
import software.constructs.Construct

public fun Construct.databaseClusterFromSnapshot(
  id: String,
  props: DatabaseClusterFromSnapshotProps,
  initializer: DatabaseClusterFromSnapshot.() -> Unit = {},
): DatabaseClusterFromSnapshot = DatabaseClusterFromSnapshot(this, id, props).apply(initializer)
