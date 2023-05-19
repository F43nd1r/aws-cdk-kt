@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
