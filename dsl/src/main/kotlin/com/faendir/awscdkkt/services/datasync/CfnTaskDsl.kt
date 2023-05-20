@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnTask
import software.amazon.awscdk.services.datasync.CfnTaskProps
import software.constructs.Construct

public fun Construct.cfnTask(
  id: String,
  props: CfnTaskProps,
  initializer: CfnTask.() -> Unit = {},
): CfnTask = CfnTask(this, id, props).apply(initializer)
