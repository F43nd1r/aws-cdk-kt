package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@Generated
public fun artifactStoreProperty(initializer: CfnPipeline.ArtifactStoreProperty.Builder.() -> Unit =
    {}): CfnPipeline.ArtifactStoreProperty =
    CfnPipeline.ArtifactStoreProperty.builder().apply(initializer).build()
