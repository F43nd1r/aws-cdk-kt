package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone

@Generated
public fun buildVPCProperty(initializer: @AwsCdkDsl CfnHostedZone.VPCProperty.Builder.() -> Unit =
    {}): CfnHostedZone.VPCProperty = CfnHostedZone.VPCProperty.Builder().apply(initializer).build()
