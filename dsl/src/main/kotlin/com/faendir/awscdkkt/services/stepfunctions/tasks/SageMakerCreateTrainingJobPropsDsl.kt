package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps

@Generated
public
    fun sageMakerCreateTrainingJobProps(initializer: SageMakerCreateTrainingJobProps.Builder.() -> Unit
    = {}): SageMakerCreateTrainingJobProps =
    SageMakerCreateTrainingJobProps.builder().apply(initializer).build()
