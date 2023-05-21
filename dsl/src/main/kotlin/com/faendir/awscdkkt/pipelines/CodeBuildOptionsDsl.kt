package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeBuildOptions

@Generated
public fun codeBuildOptions(initializer: CodeBuildOptions.Builder.() -> Unit = {}): CodeBuildOptions
    = CodeBuildOptions.builder().apply(initializer).build()
