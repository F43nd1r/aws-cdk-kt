package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions

@Generated
public fun cloudWatchLoggingOptions(initializer: CloudWatchLoggingOptions.Builder.() -> Unit = {}):
    CloudWatchLoggingOptions = CloudWatchLoggingOptions.builder().apply(initializer).build()
