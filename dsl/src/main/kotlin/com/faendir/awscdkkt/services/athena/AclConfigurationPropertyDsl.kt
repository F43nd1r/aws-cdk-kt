@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

public
    fun aclConfigurationProperty(initializer: CfnWorkGroup.AclConfigurationProperty.Builder.() -> Unit):
    CfnWorkGroup.AclConfigurationProperty =
    CfnWorkGroup.AclConfigurationProperty.builder().apply(initializer).build()
