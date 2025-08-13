package com.faendir.awscdkkt.generated.services.iotsitewise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnComputationModel
import software.amazon.awscdk.services.iotsitewise.CfnComputationModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComputationModel(
  id: String,
  props: CfnComputationModelProps,
  initializer: @AwsCdkDsl CfnComputationModel.() -> Unit = {},
): CfnComputationModel = CfnComputationModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnComputationModel(id: String, initializer: @AwsCdkDsl CfnComputationModel.Builder.() -> Unit = {}): CfnComputationModel = CfnComputationModel.Builder.create(this, id).apply(initializer).build()
