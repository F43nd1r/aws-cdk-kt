package com.faendir.awscdkkt.generated.services.forecast

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDatasetGroup
import software.amazon.awscdk.services.forecast.CfnDatasetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatasetGroup(id: String, props: CfnDatasetGroupProps): CfnDatasetGroup =
    CfnDatasetGroup(this, id, props)

@Generated
public fun Construct.cfnDatasetGroup(
  id: String,
  props: CfnDatasetGroupProps,
  initializer: @AwsCdkDsl CfnDatasetGroup.() -> Unit,
): CfnDatasetGroup = CfnDatasetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDatasetGroup(id: String, initializer: @AwsCdkDsl
    CfnDatasetGroup.Builder.() -> Unit): CfnDatasetGroup = CfnDatasetGroup.Builder.create(this,
    id).apply(initializer).build()
