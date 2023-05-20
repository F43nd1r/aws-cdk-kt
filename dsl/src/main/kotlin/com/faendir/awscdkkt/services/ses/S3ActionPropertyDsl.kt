@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

public fun s3ActionProperty(initializer: CfnReceiptRule.S3ActionProperty.Builder.() -> Unit):
    CfnReceiptRule.S3ActionProperty =
    CfnReceiptRule.S3ActionProperty.builder().apply(initializer).build()
