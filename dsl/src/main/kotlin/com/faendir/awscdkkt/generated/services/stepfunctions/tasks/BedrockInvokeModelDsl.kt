package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModel
import software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelProps
import software.constructs.Construct

@Generated
public fun Construct.bedrockInvokeModel(
  id: String,
  props: BedrockInvokeModelProps,
  initializer: @AwsCdkDsl BedrockInvokeModel.() -> Unit = {},
): BedrockInvokeModel = BedrockInvokeModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBedrockInvokeModel(id: String, initializer: @AwsCdkDsl
    BedrockInvokeModel.Builder.() -> Unit = {}): BedrockInvokeModel =
    BedrockInvokeModel.Builder.create(this, id).apply(initializer).build()
