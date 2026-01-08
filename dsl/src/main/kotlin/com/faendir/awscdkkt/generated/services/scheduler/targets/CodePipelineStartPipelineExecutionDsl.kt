package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.codepipeline.IPipelineRef
import software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution

@Generated
public fun buildCodePipelineStartPipelineExecution(pipeline: IPipelineRef, initializer: @AwsCdkDsl CodePipelineStartPipelineExecution.Builder.() -> Unit = {}): CodePipelineStartPipelineExecution = CodePipelineStartPipelineExecution.Builder.create(pipeline).apply(initializer).build()
