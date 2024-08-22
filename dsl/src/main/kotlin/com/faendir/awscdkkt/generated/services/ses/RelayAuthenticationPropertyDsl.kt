package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerRelay

@Generated
public fun buildRelayAuthenticationProperty(initializer: @AwsCdkDsl
    CfnMailManagerRelay.RelayAuthenticationProperty.Builder.() -> Unit = {}):
    CfnMailManagerRelay.RelayAuthenticationProperty =
    CfnMailManagerRelay.RelayAuthenticationProperty.Builder().apply(initializer).build()
