package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

@Generated
public fun recordSetProperty(initializer: CfnRecordSetGroup.RecordSetProperty.Builder.() -> Unit =
    {}): CfnRecordSetGroup.RecordSetProperty =
    CfnRecordSetGroup.RecordSetProperty.builder().apply(initializer).build()
