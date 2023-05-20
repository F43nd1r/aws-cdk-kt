@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
import software.constructs.Construct

public fun Construct.cfnApplicationV2(
  id: String,
  props: CfnApplicationV2Props,
  initializer: CfnApplicationV2.() -> Unit = {},
): CfnApplicationV2 = CfnApplicationV2(this, id, props).apply(initializer)
