@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnStorageSystem

public
    fun serverConfigurationProperty(initializer: CfnStorageSystem.ServerConfigurationProperty.Builder.() -> Unit):
    CfnStorageSystem.ServerConfigurationProperty =
    CfnStorageSystem.ServerConfigurationProperty.builder().apply(initializer).build()
