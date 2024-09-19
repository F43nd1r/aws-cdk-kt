package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnNetwork

@Generated
public fun buildIpPoolProperty(initializer: @AwsCdkDsl CfnNetwork.IpPoolProperty.Builder.() -> Unit
    = {}): CfnNetwork.IpPoolProperty =
    CfnNetwork.IpPoolProperty.Builder().apply(initializer).build()
