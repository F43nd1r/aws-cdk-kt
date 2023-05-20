@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDatasetGroup
import software.amazon.awscdk.services.personalize.CfnDatasetGroupProps
import software.constructs.Construct

public fun Construct.cfnDatasetGroup(
  id: String,
  props: CfnDatasetGroupProps,
  initializer: CfnDatasetGroup.() -> Unit = {},
): CfnDatasetGroup = CfnDatasetGroup(this, id, props).apply(initializer)
