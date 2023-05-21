package com.faendir.awscdkkt.services.forecast

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset
import software.amazon.awscdk.services.forecast.CfnDatasetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataset(
  id: String,
  props: CfnDatasetProps,
  initializer: CfnDataset.() -> Unit = {},
): CfnDataset = CfnDataset(this, id, props).apply(initializer)
