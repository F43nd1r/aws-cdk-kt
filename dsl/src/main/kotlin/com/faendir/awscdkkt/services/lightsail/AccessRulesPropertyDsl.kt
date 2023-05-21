package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnBucket

@Generated
public fun accessRulesProperty(initializer: CfnBucket.AccessRulesProperty.Builder.() -> Unit = {}):
    CfnBucket.AccessRulesProperty =
    CfnBucket.AccessRulesProperty.builder().apply(initializer).build()
