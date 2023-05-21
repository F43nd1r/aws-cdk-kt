package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.S3LoggingOptions

@Generated
public fun s3LoggingOptions(initializer: S3LoggingOptions.Builder.() -> Unit = {}): S3LoggingOptions
    = S3LoggingOptions.builder().apply(initializer).build()
