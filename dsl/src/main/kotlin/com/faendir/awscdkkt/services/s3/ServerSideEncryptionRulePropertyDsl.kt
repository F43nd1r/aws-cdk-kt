package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun serverSideEncryptionRuleProperty(initializer: CfnBucket.ServerSideEncryptionRuleProperty.Builder.() -> Unit
    = {}): CfnBucket.ServerSideEncryptionRuleProperty =
    CfnBucket.ServerSideEncryptionRuleProperty.builder().apply(initializer).build()
