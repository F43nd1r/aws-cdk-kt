@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnAssociation

public
    fun s3OutputLocationProperty(initializer: CfnAssociation.S3OutputLocationProperty.Builder.() -> Unit):
    CfnAssociation.S3OutputLocationProperty =
    CfnAssociation.S3OutputLocationProperty.builder().apply(initializer).build()
