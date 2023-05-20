@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun replicationRuleAndOperatorProperty(initializer: CfnBucket.ReplicationRuleAndOperatorProperty.Builder.() -> Unit):
    CfnBucket.ReplicationRuleAndOperatorProperty =
    CfnBucket.ReplicationRuleAndOperatorProperty.builder().apply(initializer).build()
