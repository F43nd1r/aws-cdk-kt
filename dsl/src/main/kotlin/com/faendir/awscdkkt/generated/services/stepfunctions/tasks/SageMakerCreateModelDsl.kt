package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModelProps
import software.constructs.Construct

@Generated
public fun Construct.sageMakerCreateModel(id: String, props: SageMakerCreateModelProps):
    SageMakerCreateModel = SageMakerCreateModel(this, id, props)

@Generated
public fun Construct.sageMakerCreateModel(
  id: String,
  props: SageMakerCreateModelProps,
  initializer: @AwsCdkDsl SageMakerCreateModel.() -> Unit,
): SageMakerCreateModel = SageMakerCreateModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSageMakerCreateModel(id: String, initializer: @AwsCdkDsl
    SageMakerCreateModel.Builder.() -> Unit): SageMakerCreateModel =
    SageMakerCreateModel.Builder.create(this, id).apply(initializer).build()
