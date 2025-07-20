package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnInstanceSnapshot
import software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceSnapshot(
  id: String,
  props: CfnInstanceSnapshotProps,
  initializer: @AwsCdkDsl CfnInstanceSnapshot.() -> Unit = {},
): CfnInstanceSnapshot = CfnInstanceSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstanceSnapshot(id: String, initializer: @AwsCdkDsl CfnInstanceSnapshot.Builder.() -> Unit = {}): CfnInstanceSnapshot = CfnInstanceSnapshot.Builder.create(this, id).apply(initializer).build()
