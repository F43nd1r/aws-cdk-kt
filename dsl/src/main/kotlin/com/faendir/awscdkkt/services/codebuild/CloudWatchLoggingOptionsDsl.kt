@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions

public fun cloudWatchLoggingOptions(initializer: CloudWatchLoggingOptions.Builder.() -> Unit):
    CloudWatchLoggingOptions = CloudWatchLoggingOptions.builder().apply(initializer).build()
