@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnStorageSystem

public
    fun serverConfigurationProperty(initializer: CfnStorageSystem.ServerConfigurationProperty.Builder.() -> Unit):
    CfnStorageSystem.ServerConfigurationProperty =
    CfnStorageSystem.ServerConfigurationProperty.builder().apply(initializer).build()
