package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine

@Generated
public
    fun activeDirectoryConfigurationProperty(initializer: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder.() -> Unit
    = {}): CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty =
    CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.builder().apply(initializer).build()
