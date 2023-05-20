@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnJob
import software.amazon.awscdk.services.glue.CfnJobProps
import software.constructs.Construct

public fun Construct.cfnJob(
  id: String,
  props: CfnJobProps,
  initializer: CfnJob.() -> Unit = {},
): CfnJob = CfnJob(this, id, props).apply(initializer)
