package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataSet(id: String, initializer: CfnDataSet.() -> Unit = {}): CfnDataSet =
    CfnDataSet(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataSet(
  id: String,
  props: CfnDataSetProps,
  initializer: CfnDataSet.() -> Unit = {},
): CfnDataSet = CfnDataSet(this, id, props).apply(initializer)
