package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnMember

@Generated
public
    fun networkConfigurationProperty(initializer: CfnMember.NetworkConfigurationProperty.Builder.() -> Unit
    = {}): CfnMember.NetworkConfigurationProperty =
    CfnMember.NetworkConfigurationProperty.builder().apply(initializer).build()
