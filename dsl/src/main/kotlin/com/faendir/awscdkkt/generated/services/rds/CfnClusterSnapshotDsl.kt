package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnClusterSnapshot
import software.amazon.awscdk.services.rds.CfnClusterSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterSnapshot(
  id: String,
  props: CfnClusterSnapshotProps,
  initializer: @AwsCdkDsl CfnClusterSnapshot.() -> Unit = {},
): CfnClusterSnapshot = CfnClusterSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClusterSnapshot(id: String, initializer: @AwsCdkDsl CfnClusterSnapshot.Builder.() -> Unit = {}): CfnClusterSnapshot = CfnClusterSnapshot.Builder.create(this, id).apply(initializer).build()
