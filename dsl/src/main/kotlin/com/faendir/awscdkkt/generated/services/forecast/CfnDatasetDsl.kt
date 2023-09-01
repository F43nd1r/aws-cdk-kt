package com.faendir.awscdkkt.generated.services.forecast

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnDataset.() -> Unit = {},
): CfnDataset = CfnDataset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataset(id: String, initializer: @AwsCdkDsl
    CfnDataset.Builder.() -> Unit = {}): CfnDataset = CfnDataset.Builder.create(this,
    id).apply(initializer).build()
