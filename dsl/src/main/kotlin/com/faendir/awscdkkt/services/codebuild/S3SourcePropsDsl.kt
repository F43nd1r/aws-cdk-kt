package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.S3SourceProps

@Generated
public fun s3SourceProps(initializer: S3SourceProps.Builder.() -> Unit = {}): S3SourceProps =
    S3SourceProps.builder().apply(initializer).build()
