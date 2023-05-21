package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider

@Generated
public
    fun oidcOptionsProperty(initializer: CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder.() -> Unit
    = {}): CfnVerifiedAccessTrustProvider.OidcOptionsProperty =
    CfnVerifiedAccessTrustProvider.OidcOptionsProperty.builder().apply(initializer).build()
