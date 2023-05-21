package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@Generated
public fun outputArtifactProperty(initializer: CfnPipeline.OutputArtifactProperty.Builder.() -> Unit
    = {}): CfnPipeline.OutputArtifactProperty =
    CfnPipeline.OutputArtifactProperty.builder().apply(initializer).build()
