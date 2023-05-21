package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.S3SourceOptions

@Generated
public fun s3SourceOptions(initializer: S3SourceOptions.Builder.() -> Unit = {}): S3SourceOptions =
    S3SourceOptions.builder().apply(initializer).build()
