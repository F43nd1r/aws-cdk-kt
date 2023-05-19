@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
