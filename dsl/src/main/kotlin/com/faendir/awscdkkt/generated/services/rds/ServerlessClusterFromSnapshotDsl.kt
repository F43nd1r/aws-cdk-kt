package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ServerlessClusterFromSnapshot.() -> Unit = {},
): ServerlessClusterFromSnapshot = ServerlessClusterFromSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildServerlessClusterFromSnapshot(id: String, initializer: @AwsCdkDsl
    ServerlessClusterFromSnapshot.Builder.() -> Unit = {}): ServerlessClusterFromSnapshot =
    ServerlessClusterFromSnapshot.Builder.create(this, id).apply(initializer).build()
