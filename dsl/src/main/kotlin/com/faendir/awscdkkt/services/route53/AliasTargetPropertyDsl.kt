@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

public
    fun aliasTargetProperty(initializer: CfnRecordSetGroup.AliasTargetProperty.Builder.() -> Unit):
    CfnRecordSetGroup.AliasTargetProperty =
    CfnRecordSetGroup.AliasTargetProperty.builder().apply(initializer).build()
