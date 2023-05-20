@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

public
    fun s3KeyFilterRuleProperty(initializer: CfnFunction.S3KeyFilterRuleProperty.Builder.() -> Unit):
    CfnFunction.S3KeyFilterRuleProperty =
    CfnFunction.S3KeyFilterRuleProperty.builder().apply(initializer).build()
