@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps
import software.constructs.Construct

public fun Construct.cfnApplicationOutput(
  id: String,
  props: CfnApplicationOutputProps,
  initializer: CfnApplicationOutput.() -> Unit = {},
): CfnApplicationOutput = CfnApplicationOutput(this, id, props).apply(initializer)
