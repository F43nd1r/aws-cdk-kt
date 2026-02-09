package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDatabaseSnapshot
import software.amazon.awscdk.services.lightsail.CfnDatabaseSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatabaseSnapshot(
  id: String,
  props: CfnDatabaseSnapshotProps,
  initializer: @AwsCdkDsl CfnDatabaseSnapshot.() -> Unit = {},
): CfnDatabaseSnapshot = CfnDatabaseSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDatabaseSnapshot(id: String, initializer: @AwsCdkDsl CfnDatabaseSnapshot.Builder.() -> Unit = {}): CfnDatabaseSnapshot = CfnDatabaseSnapshot.Builder.create(this, id).apply(initializer).build()
