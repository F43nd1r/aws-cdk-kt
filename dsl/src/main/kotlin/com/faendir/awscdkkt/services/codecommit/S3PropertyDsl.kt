@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository

public fun s3Property(initializer: CfnRepository.S3Property.Builder.() -> Unit):
    CfnRepository.S3Property = CfnRepository.S3Property.builder().apply(initializer).build()
