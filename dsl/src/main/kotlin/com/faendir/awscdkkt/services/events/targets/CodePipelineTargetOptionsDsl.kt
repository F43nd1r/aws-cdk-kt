package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.CodePipelineTargetOptions

@Generated
public fun codePipelineTargetOptions(initializer: CodePipelineTargetOptions.Builder.() -> Unit =
    {}): CodePipelineTargetOptions = CodePipelineTargetOptions.builder().apply(initializer).build()
