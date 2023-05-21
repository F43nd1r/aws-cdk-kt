package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationOutputV2(
  id: String,
  props: CfnApplicationOutputV2Props,
  initializer: CfnApplicationOutputV2.() -> Unit = {},
): CfnApplicationOutputV2 = CfnApplicationOutputV2(this, id, props).apply(initializer)
