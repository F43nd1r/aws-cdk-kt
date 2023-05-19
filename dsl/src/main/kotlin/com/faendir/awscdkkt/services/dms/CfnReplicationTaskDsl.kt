@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationTask
import software.amazon.awscdk.services.dms.CfnReplicationTaskProps
import software.constructs.Construct

public fun Construct.cfnReplicationTask(
  id: String,
  props: CfnReplicationTaskProps,
  initializer: CfnReplicationTask.() -> Unit = {},
): CfnReplicationTask = CfnReplicationTask(this, id, props).apply(initializer)
