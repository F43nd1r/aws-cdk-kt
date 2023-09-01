package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.SrvRecordValue

@Generated
public fun buildSrvRecordValue(initializer: @AwsCdkDsl SrvRecordValue.Builder.() -> Unit = {}):
    SrvRecordValue = SrvRecordValue.Builder().apply(initializer).build()
