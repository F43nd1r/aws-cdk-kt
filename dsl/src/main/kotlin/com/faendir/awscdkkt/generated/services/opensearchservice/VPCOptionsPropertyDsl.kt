package com.faendir.awscdkkt.generated.services.opensearchservice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public fun buildVPCOptionsProperty(initializer: @AwsCdkDsl
    CfnDomain.VPCOptionsProperty.Builder.() -> Unit = {}): CfnDomain.VPCOptionsProperty =
    CfnDomain.VPCOptionsProperty.Builder().apply(initializer).build()
