package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnSnapshot
import software.amazon.awscdk.services.fsx.CfnSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSnapshot(
  id: String,
  props: CfnSnapshotProps,
  initializer: CfnSnapshot.() -> Unit = {},
): CfnSnapshot = CfnSnapshot(this, id, props).apply(initializer)
