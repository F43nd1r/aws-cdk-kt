package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps

@Generated
public
    fun sageMakerCreateTransformJobProps(initializer: SageMakerCreateTransformJobProps.Builder.() -> Unit
    = {}): SageMakerCreateTransformJobProps =
    SageMakerCreateTransformJobProps.builder().apply(initializer).build()
