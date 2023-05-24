package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public fun buildS3ActionProperty(initializer: @AwsCdkDsl
    CfnReceiptRule.S3ActionProperty.Builder.() -> Unit): CfnReceiptRule.S3ActionProperty =
    CfnReceiptRule.S3ActionProperty.Builder().apply(initializer).build()
