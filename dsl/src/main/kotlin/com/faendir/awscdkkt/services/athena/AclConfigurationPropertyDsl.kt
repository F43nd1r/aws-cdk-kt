package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

@Generated
public
    fun aclConfigurationProperty(initializer: CfnWorkGroup.AclConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkGroup.AclConfigurationProperty =
    CfnWorkGroup.AclConfigurationProperty.builder().apply(initializer).build()
