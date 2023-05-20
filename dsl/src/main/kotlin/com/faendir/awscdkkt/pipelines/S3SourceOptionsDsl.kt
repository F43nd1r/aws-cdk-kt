@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.S3SourceOptions

public fun s3SourceOptions(initializer: S3SourceOptions.Builder.() -> Unit): S3SourceOptions =
    S3SourceOptions.builder().apply(initializer).build()
