@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSetProps
import software.constructs.Construct

public fun Construct.cfnDataSet(
  id: String,
  props: CfnDataSetProps,
  initializer: CfnDataSet.() -> Unit = {},
): CfnDataSet = CfnDataSet(this, id, props).apply(initializer)

public fun Construct.cfnDataSet(id: String, initializer: CfnDataSet.() -> Unit = {}): CfnDataSet =
    CfnDataSet(this, id).apply(initializer)
