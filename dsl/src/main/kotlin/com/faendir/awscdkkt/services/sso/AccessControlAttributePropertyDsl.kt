package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration

@Generated
public
    fun accessControlAttributeProperty(initializer: CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.Builder.() -> Unit
    = {}): CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty =
    CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.builder().apply(initializer).build()
