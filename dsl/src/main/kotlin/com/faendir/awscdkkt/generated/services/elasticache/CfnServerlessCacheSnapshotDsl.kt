package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnServerlessCacheSnapshot
import software.amazon.awscdk.services.elasticache.CfnServerlessCacheSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServerlessCacheSnapshot(
  id: String,
  props: CfnServerlessCacheSnapshotProps,
  initializer: @AwsCdkDsl CfnServerlessCacheSnapshot.() -> Unit = {},
): CfnServerlessCacheSnapshot = CfnServerlessCacheSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServerlessCacheSnapshot(id: String, initializer: @AwsCdkDsl CfnServerlessCacheSnapshot.Builder.() -> Unit = {}): CfnServerlessCacheSnapshot = CfnServerlessCacheSnapshot.Builder.create(this, id).apply(initializer).build()
