@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource

public fun s3DataSource(initializer: S3DataSource.Builder.() -> Unit): S3DataSource =
    S3DataSource.builder().apply(initializer).build()
