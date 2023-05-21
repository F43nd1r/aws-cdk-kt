package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.databaseInstanceFromSnapshot(
  id: String,
  props: DatabaseInstanceFromSnapshotProps,
  initializer: DatabaseInstanceFromSnapshot.() -> Unit = {},
): DatabaseInstanceFromSnapshot = DatabaseInstanceFromSnapshot(this, id, props).apply(initializer)
