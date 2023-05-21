package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.AliasRecordTargetConfig

@Generated
public fun aliasRecordTargetConfig(initializer: AliasRecordTargetConfig.Builder.() -> Unit = {}):
    AliasRecordTargetConfig = AliasRecordTargetConfig.builder().apply(initializer).build()
