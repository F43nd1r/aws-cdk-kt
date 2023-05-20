@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public fun s3Property(initializer: CfnCluster.S3Property.Builder.() -> Unit): CfnCluster.S3Property
    = CfnCluster.S3Property.builder().apply(initializer).build()
