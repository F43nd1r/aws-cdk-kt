package com.faendir.awscdkkt.generated.services.cleanroomsml

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset
import software.amazon.awscdk.services.cleanroomsml.CfnTrainingDatasetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrainingDataset(
  id: String,
  props: CfnTrainingDatasetProps,
  initializer: @AwsCdkDsl CfnTrainingDataset.() -> Unit = {},
): CfnTrainingDataset = CfnTrainingDataset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrainingDataset(id: String, initializer: @AwsCdkDsl
    CfnTrainingDataset.Builder.() -> Unit = {}): CfnTrainingDataset =
    CfnTrainingDataset.Builder.create(this, id).apply(initializer).build()
