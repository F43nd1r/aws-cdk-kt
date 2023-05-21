package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationV2(
  id: String,
  props: CfnApplicationV2Props,
  initializer: CfnApplicationV2.() -> Unit = {},
): CfnApplicationV2 = CfnApplicationV2(this, id, props).apply(initializer)
