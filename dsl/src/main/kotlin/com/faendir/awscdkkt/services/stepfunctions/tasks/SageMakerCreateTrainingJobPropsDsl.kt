@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps

public
    fun sageMakerCreateTrainingJobProps(initializer: SageMakerCreateTrainingJobProps.Builder.() -> Unit):
    SageMakerCreateTrainingJobProps =
    SageMakerCreateTrainingJobProps.builder().apply(initializer).build()
