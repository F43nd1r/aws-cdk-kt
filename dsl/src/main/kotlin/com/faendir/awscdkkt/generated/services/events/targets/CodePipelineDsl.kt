package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.IPipeline
import software.amazon.awscdk.services.events.targets.CodePipeline

@Generated
public fun buildCodePipeline(pipeline: IPipeline, initializer: @AwsCdkDsl
    CodePipeline.Builder.() -> Unit = {}): CodePipeline =
    CodePipeline.Builder.create(pipeline).apply(initializer).build()
