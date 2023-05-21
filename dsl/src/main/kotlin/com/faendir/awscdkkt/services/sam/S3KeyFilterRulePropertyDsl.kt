package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun s3KeyFilterRuleProperty(initializer: CfnFunction.S3KeyFilterRuleProperty.Builder.() -> Unit
    = {}): CfnFunction.S3KeyFilterRuleProperty =
    CfnFunction.S3KeyFilterRuleProperty.builder().apply(initializer).build()
