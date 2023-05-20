@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.S3LoggingOptions

public fun s3LoggingOptions(initializer: S3LoggingOptions.Builder.() -> Unit): S3LoggingOptions =
    S3LoggingOptions.builder().apply(initializer).build()
