@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob
import software.amazon.awscdk.services.databrew.CfnJobProps
import software.constructs.Construct

public fun Construct.cfnJob(
  id: String,
  props: CfnJobProps,
  initializer: CfnJob.() -> Unit = {},
): CfnJob = CfnJob(this, id, props).apply(initializer)
