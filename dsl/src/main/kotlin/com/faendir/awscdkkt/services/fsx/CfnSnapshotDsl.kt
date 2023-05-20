@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
