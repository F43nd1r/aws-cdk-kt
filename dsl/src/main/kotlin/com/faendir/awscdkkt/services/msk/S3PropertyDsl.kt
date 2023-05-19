@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public fun s3Property(initializer: CfnCluster.S3Property.Builder.() -> Unit): CfnCluster.S3Property
    = CfnCluster.S3Property.builder().apply(initializer).build()
