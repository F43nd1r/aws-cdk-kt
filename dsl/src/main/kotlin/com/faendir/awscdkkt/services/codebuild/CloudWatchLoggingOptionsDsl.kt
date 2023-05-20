@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions

public fun cloudWatchLoggingOptions(initializer: CloudWatchLoggingOptions.Builder.() -> Unit):
    CloudWatchLoggingOptions = CloudWatchLoggingOptions.builder().apply(initializer).build()
