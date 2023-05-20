@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps
import software.constructs.Construct

public fun Construct.cfnApplicationOutput(
  id: String,
  props: CfnApplicationOutputProps,
  initializer: CfnApplicationOutput.() -> Unit = {},
): CfnApplicationOutput = CfnApplicationOutput(this, id, props).apply(initializer)
