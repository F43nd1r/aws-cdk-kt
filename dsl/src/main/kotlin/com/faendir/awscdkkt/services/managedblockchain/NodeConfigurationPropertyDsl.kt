package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnNode

@Generated
public
    fun nodeConfigurationProperty(initializer: CfnNode.NodeConfigurationProperty.Builder.() -> Unit
    = {}): CfnNode.NodeConfigurationProperty =
    CfnNode.NodeConfigurationProperty.builder().apply(initializer).build()
