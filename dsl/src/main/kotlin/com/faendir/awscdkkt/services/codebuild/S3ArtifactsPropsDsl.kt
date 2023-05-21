package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.S3ArtifactsProps

@Generated
public fun s3ArtifactsProps(initializer: S3ArtifactsProps.Builder.() -> Unit = {}): S3ArtifactsProps
    = S3ArtifactsProps.builder().apply(initializer).build()
