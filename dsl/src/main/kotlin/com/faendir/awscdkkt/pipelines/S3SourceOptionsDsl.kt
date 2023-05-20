@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.S3SourceOptions

public fun s3SourceOptions(initializer: S3SourceOptions.Builder.() -> Unit): S3SourceOptions =
    S3SourceOptions.builder().apply(initializer).build()
