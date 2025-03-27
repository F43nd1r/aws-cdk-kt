package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter

@Generated
public fun buildSageMakerPipelineParameter(initializer: @AwsCdkDsl
    SageMakerPipelineParameter.Builder.() -> Unit = {}): SageMakerPipelineParameter =
    SageMakerPipelineParameter.Builder().apply(initializer).build()
