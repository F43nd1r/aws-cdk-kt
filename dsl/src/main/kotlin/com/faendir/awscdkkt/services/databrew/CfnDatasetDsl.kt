@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset
import software.amazon.awscdk.services.databrew.CfnDatasetProps
import software.constructs.Construct

public fun Construct.cfnDataset(
  id: String,
  props: CfnDatasetProps,
  initializer: CfnDataset.() -> Unit = {},
): CfnDataset = CfnDataset(this, id, props).apply(initializer)
