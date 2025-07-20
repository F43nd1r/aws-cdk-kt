package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeBuildStep

@Generated
public fun buildCodeBuildStep(id: String, initializer: @AwsCdkDsl CodeBuildStep.Builder.() -> Unit = {}): CodeBuildStep = CodeBuildStep.Builder.create(id).apply(initializer).build()
