package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer

@Generated
public
    fun identityProviderDetailsProperty(initializer: CfnServer.IdentityProviderDetailsProperty.Builder.() -> Unit
    = {}): CfnServer.IdentityProviderDetailsProperty =
    CfnServer.IdentityProviderDetailsProperty.builder().apply(initializer).build()
