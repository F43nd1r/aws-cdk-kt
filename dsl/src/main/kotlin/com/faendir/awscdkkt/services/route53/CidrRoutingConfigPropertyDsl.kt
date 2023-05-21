package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

@Generated
public
    fun cidrRoutingConfigProperty(initializer: CfnRecordSetGroup.CidrRoutingConfigProperty.Builder.() -> Unit
    = {}): CfnRecordSetGroup.CidrRoutingConfigProperty =
    CfnRecordSetGroup.CidrRoutingConfigProperty.builder().apply(initializer).build()
