@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.CodePipelineTargetOptions

public fun codePipelineTargetOptions(initializer: CodePipelineTargetOptions.Builder.() -> Unit):
    CodePipelineTargetOptions = CodePipelineTargetOptions.builder().apply(initializer).build()
