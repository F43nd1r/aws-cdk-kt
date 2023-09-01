package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.databaseClusterFromSnapshot(
  id: String,
  props: DatabaseClusterFromSnapshotProps,
  initializer: @AwsCdkDsl DatabaseClusterFromSnapshot.() -> Unit = {},
): DatabaseClusterFromSnapshot = DatabaseClusterFromSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseClusterFromSnapshot(id: String, initializer: @AwsCdkDsl
    DatabaseClusterFromSnapshot.Builder.() -> Unit = {}): DatabaseClusterFromSnapshot =
    DatabaseClusterFromSnapshot.Builder.create(this, id).apply(initializer).build()
