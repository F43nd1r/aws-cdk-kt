@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnAssociation

public
    fun s3OutputLocationProperty(initializer: CfnAssociation.S3OutputLocationProperty.Builder.() -> Unit):
    CfnAssociation.S3OutputLocationProperty =
    CfnAssociation.S3OutputLocationProperty.builder().apply(initializer).build()
