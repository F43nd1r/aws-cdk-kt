package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.IPipeline
import software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution

@Generated
public fun buildSageMakerStartPipelineExecution(pipeline: IPipeline, initializer: @AwsCdkDsl SageMakerStartPipelineExecution.Builder.() -> Unit = {}): SageMakerStartPipelineExecution = SageMakerStartPipelineExecution.Builder.create(pipeline).apply(initializer).build()
