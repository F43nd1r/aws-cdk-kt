package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

@Generated
public fun aliasTargetProperty(initializer: CfnRecordSetGroup.AliasTargetProperty.Builder.() -> Unit
    = {}): CfnRecordSetGroup.AliasTargetProperty =
    CfnRecordSetGroup.AliasTargetProperty.builder().apply(initializer).build()
