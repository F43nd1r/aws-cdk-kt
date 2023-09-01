package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl DatabaseInstanceFromSnapshot.() -> Unit = {},
): DatabaseInstanceFromSnapshot = DatabaseInstanceFromSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseInstanceFromSnapshot(id: String, initializer: @AwsCdkDsl
    DatabaseInstanceFromSnapshot.Builder.() -> Unit = {}): DatabaseInstanceFromSnapshot =
    DatabaseInstanceFromSnapshot.Builder.create(this, id).apply(initializer).build()
