package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeBuildOptions

@Generated
public fun buildCodeBuildOptions(initializer: @AwsCdkDsl CodeBuildOptions.Builder.() -> Unit = {}):
    CodeBuildOptions = CodeBuildOptions.Builder().apply(initializer).build()
