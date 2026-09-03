package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSnapshot
import software.amazon.awscdk.services.rds.CfnDBSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBSnapshot(
  id: String,
  props: CfnDBSnapshotProps,
  initializer: @AwsCdkDsl CfnDBSnapshot.() -> Unit = {},
): CfnDBSnapshot = CfnDBSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBSnapshot(id: String, initializer: @AwsCdkDsl CfnDBSnapshot.Builder.() -> Unit = {}): CfnDBSnapshot = CfnDBSnapshot.Builder.create(this, id).apply(initializer).build()
