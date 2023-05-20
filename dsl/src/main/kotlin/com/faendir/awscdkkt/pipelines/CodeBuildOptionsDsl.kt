@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeBuildOptions

public fun codeBuildOptions(initializer: CodeBuildOptions.Builder.() -> Unit): CodeBuildOptions =
    CodeBuildOptions.builder().apply(initializer).build()
