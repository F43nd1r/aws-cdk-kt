@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataset
import software.amazon.awscdk.services.personalize.CfnDatasetProps
import software.constructs.Construct

public fun Construct.cfnDataset(
  id: String,
  props: CfnDatasetProps,
  initializer: CfnDataset.() -> Unit = {},
): CfnDataset = CfnDataset(this, id, props).apply(initializer)
