package com.faendir.awscdkkt.generated.services.neptunegraph

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptunegraph.CfnGraphSnapshot
import software.amazon.awscdk.services.neptunegraph.CfnGraphSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGraphSnapshot(
  id: String,
  props: CfnGraphSnapshotProps,
  initializer: @AwsCdkDsl CfnGraphSnapshot.() -> Unit = {},
): CfnGraphSnapshot = CfnGraphSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGraphSnapshot(id: String, initializer: @AwsCdkDsl CfnGraphSnapshot.Builder.() -> Unit = {}): CfnGraphSnapshot = CfnGraphSnapshot.Builder.create(this, id).apply(initializer).build()
