@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.S3LoggingOptions

public fun s3LoggingOptions(initializer: S3LoggingOptions.Builder.() -> Unit): S3LoggingOptions =
    S3LoggingOptions.builder().apply(initializer).build()
