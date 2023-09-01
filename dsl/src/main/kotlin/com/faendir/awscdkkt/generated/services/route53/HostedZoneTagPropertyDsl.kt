package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone

@Generated
public fun buildHostedZoneTagProperty(initializer: @AwsCdkDsl
    CfnHostedZone.HostedZoneTagProperty.Builder.() -> Unit = {}):
    CfnHostedZone.HostedZoneTagProperty =
    CfnHostedZone.HostedZoneTagProperty.Builder().apply(initializer).build()
