@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

public fun s3Property(initializer: CfnVerifiedAccessInstance.S3Property.Builder.() -> Unit):
    CfnVerifiedAccessInstance.S3Property =
    CfnVerifiedAccessInstance.S3Property.builder().apply(initializer).build()
