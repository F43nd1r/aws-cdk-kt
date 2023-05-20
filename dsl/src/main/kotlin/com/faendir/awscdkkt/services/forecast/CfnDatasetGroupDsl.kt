@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.forecast

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDatasetGroup
import software.amazon.awscdk.services.forecast.CfnDatasetGroupProps
import software.constructs.Construct

public fun Construct.cfnDatasetGroup(
  id: String,
  props: CfnDatasetGroupProps,
  initializer: CfnDatasetGroup.() -> Unit = {},
): CfnDatasetGroup = CfnDatasetGroup(this, id, props).apply(initializer)
