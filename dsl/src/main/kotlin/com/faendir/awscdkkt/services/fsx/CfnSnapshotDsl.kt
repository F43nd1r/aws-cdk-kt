@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnSnapshot
import software.amazon.awscdk.services.fsx.CfnSnapshotProps
import software.constructs.Construct

public fun Construct.cfnSnapshot(
  id: String,
  props: CfnSnapshotProps,
  initializer: CfnSnapshot.() -> Unit = {},
): CfnSnapshot = CfnSnapshot(this, id, props).apply(initializer)
