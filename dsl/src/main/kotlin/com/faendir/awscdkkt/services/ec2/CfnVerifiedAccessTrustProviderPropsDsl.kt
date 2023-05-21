package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps

@Generated
public
    fun cfnVerifiedAccessTrustProviderProps(initializer: CfnVerifiedAccessTrustProviderProps.Builder.() -> Unit
    = {}): CfnVerifiedAccessTrustProviderProps =
    CfnVerifiedAccessTrustProviderProps.builder().apply(initializer).build()
