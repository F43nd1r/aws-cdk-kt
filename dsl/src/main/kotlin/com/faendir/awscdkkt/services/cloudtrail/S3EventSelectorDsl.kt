@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.S3EventSelector

public fun s3EventSelector(initializer: S3EventSelector.Builder.() -> Unit): S3EventSelector =
    S3EventSelector.builder().apply(initializer).build()
