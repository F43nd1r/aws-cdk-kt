@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps
import software.constructs.Construct

public fun Construct.databaseInstanceFromSnapshot(
  id: String,
  props: DatabaseInstanceFromSnapshotProps,
  initializer: DatabaseInstanceFromSnapshot.() -> Unit = {},
): DatabaseInstanceFromSnapshot = DatabaseInstanceFromSnapshot(this, id, props).apply(initializer)
