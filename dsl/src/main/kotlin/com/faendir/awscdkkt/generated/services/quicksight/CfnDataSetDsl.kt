package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSet
import software.amazon.awscdk.services.quicksight.CfnDataSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataSet(id: String, props: CfnDataSetProps): CfnDataSet = CfnDataSet(this,
    id, props)

@Generated
public fun Construct.cfnDataSet(
  id: String,
  props: CfnDataSetProps,
  initializer: @AwsCdkDsl CfnDataSet.() -> Unit,
): CfnDataSet = CfnDataSet(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnDataSet(id: String): CfnDataSet = CfnDataSet(this, id)

@Generated
public fun Construct.cfnDataSet(id: String, initializer: @AwsCdkDsl CfnDataSet.() -> Unit):
    CfnDataSet = CfnDataSet(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnDataSet(id: String, initializer: @AwsCdkDsl
    CfnDataSet.Builder.() -> Unit): CfnDataSet = CfnDataSet.Builder.create(this,
    id).apply(initializer).build()
